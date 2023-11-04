package edu.pe.cibertec.Fastrack_DAW1_Grupo7.Controller.backoffice;

import edu.pe.cibertec.Fastrack_DAW1_Grupo7.Model.bd.Cliente;
import edu.pe.cibertec.Fastrack_DAW1_Grupo7.Model.bd.HistorialPago;
import edu.pe.cibertec.Fastrack_DAW1_Grupo7.Model.request.ClienteRequest;
import edu.pe.cibertec.Fastrack_DAW1_Grupo7.Model.response.ResultadoResponse;
import edu.pe.cibertec.Fastrack_DAW1_Grupo7.Service.ClienteService;
import edu.pe.cibertec.Fastrack_DAW1_Grupo7.Service.HistorialPagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;


    @Autowired
    private HistorialPagoService historialPagoService;

    @GetMapping("/listarclientes")
    public String listadototal(Model model){
        model.addAttribute("listadocliente", clienteService.listarClientes());
        model.addAttribute("listadohistorialpago", historialPagoService.listar());
        return "backoffice/cliente/frmCliente";
    }


    @GetMapping("/frmcliente")
    @ResponseBody
    public String frmcliente(){
        return "backoffice/cliente/frmCliente";
    }

    @GetMapping("/listarcliente")
    @ResponseBody
    public List<Cliente> listarcliente(){
        return clienteService.listarClientes();
    }

    @PostMapping("/guardarcliente")
    @ResponseBody
    public ResultadoResponse guardarcliente(@RequestBody ClienteRequest clienteRequest){
        String mensaje = "";
        Boolean respuesta;
        respuesta = clienteService.guadarCliente(clienteRequest);
        mensaje = respuesta ? "Se guardo correctamente" : "No se guardo correctamente";
        return ResultadoResponse.builder().mensaje(mensaje).respuesta(respuesta).build();
    }
}
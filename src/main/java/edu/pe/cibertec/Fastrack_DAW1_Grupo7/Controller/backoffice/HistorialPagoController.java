package edu.pe.cibertec.Fastrack_DAW1_Grupo7.Controller.backoffice;

import edu.pe.cibertec.Fastrack_DAW1_Grupo7.Model.bd.HistorialPago;
import edu.pe.cibertec.Fastrack_DAW1_Grupo7.Service.HistorialPagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/historialpago")
public class HistorialPagoController {

    @Autowired
    private HistorialPagoService historialPagoService;

    @GetMapping("/listarhistorialpago")
    @ResponseBody
    private List<HistorialPago> listarhistorialpago(){
        return historialPagoService.listar();
    }



}

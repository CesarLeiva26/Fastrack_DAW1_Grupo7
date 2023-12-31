package edu.pe.cibertec.Fastrack_DAW1_Grupo7.Controller.backoffice;

import edu.pe.cibertec.Fastrack_DAW1_Grupo7.Model.bd.Locales;
import edu.pe.cibertec.Fastrack_DAW1_Grupo7.Model.request.LocalRequest;
import edu.pe.cibertec.Fastrack_DAW1_Grupo7.Model.response.ResultadoResponse;
import edu.pe.cibertec.Fastrack_DAW1_Grupo7.Service.LocalesService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@AllArgsConstructor
@RequestMapping("/locales")
public class LocalesController {

    private LocalesService localesService;

    @GetMapping("")
    public String frmLocales(Model model){
        model.addAttribute("listaLocales", localesService.listarLocales());
        return "backoffice/locales/frmLocales";
    }

    @GetMapping("/listar")
    @ResponseBody
    public List<Locales> listarLocales(){
        return localesService.listarLocales();
    }


    @PostMapping("/guardar")
    @ResponseBody
    public ResultadoResponse guardarLocales(@RequestBody LocalRequest localRequest) {
        return localesService.guardarLocales(localRequest);
    }

}

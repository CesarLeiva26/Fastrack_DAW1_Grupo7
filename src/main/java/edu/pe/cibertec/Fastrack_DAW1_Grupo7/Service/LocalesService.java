package edu.pe.cibertec.Fastrack_DAW1_Grupo7.Service;

import edu.pe.cibertec.Fastrack_DAW1_Grupo7.Model.bd.Empleado;
import edu.pe.cibertec.Fastrack_DAW1_Grupo7.Model.bd.Locales;
import edu.pe.cibertec.Fastrack_DAW1_Grupo7.Model.request.LocalRequest;
import edu.pe.cibertec.Fastrack_DAW1_Grupo7.Model.response.ResultadoResponse;
import edu.pe.cibertec.Fastrack_DAW1_Grupo7.Repository.LocalesRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class LocalesService {

    public LocalesRepository localesRepository;

    public List<Locales> listarLocales(){
        return localesRepository.findAll();
    }


    public ResultadoResponse guardarLocales(LocalRequest local) {
        String mensaje = "Usuario registrado correctamente";
        Boolean respuesta = true;
        try {
            Locales objLocal = new Locales();
            if (local.getIdlocal() != null && local.getIdlocal() > 0) {
                objLocal.setIdlocal(local.getIdlocal());
            }
            objLocal.setNombrelocal(local.getNombrelocal());
            objLocal.setDireccionlocal(local.getDireccionlocal());
            objLocal.setCiudadlocal(local.getCiudadlocal());
            objLocal.setCodigopostal(local.getCodigopostal());
            objLocal.setTelefonolocal(local.getTelefonolocal());

            Empleado empleado = new Empleado();
            empleado.setIdempleado(local.getIdempleado());
            objLocal.setEmpleado(empleado);
            localesRepository.save(objLocal);
        } catch (Exception e) {
            mensaje = "Usuario no registrado";
            respuesta = false;
        }
        return ResultadoResponse.builder().mensaje(mensaje).respuesta(respuesta).build();
    }

}

package edu.pe.cibertec.Fastrack_DAW1_Grupo7.Service;

import edu.pe.cibertec.Fastrack_DAW1_Grupo7.Model.bd.TipoEmpleado;
import edu.pe.cibertec.Fastrack_DAW1_Grupo7.Repository.TipoEmpleadoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class TipoEmpleadoService {

    public TipoEmpleadoRepository tipoEmpleadoRepository;

    public List<TipoEmpleado>tipoEmpleados(){
        return tipoEmpleadoRepository.findAll();
    }
}

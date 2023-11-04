package edu.pe.cibertec.Fastrack_DAW1_Grupo7.Repository;

import edu.pe.cibertec.Fastrack_DAW1_Grupo7.Model.bd.Cliente;
import edu.pe.cibertec.Fastrack_DAW1_Grupo7.Model.bd.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpleadoRepository extends JpaRepository<Empleado,Integer> {
    List<Empleado> findByNombre(String nombre);

}

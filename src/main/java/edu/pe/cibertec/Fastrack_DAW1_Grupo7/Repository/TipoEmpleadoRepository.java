package edu.pe.cibertec.Fastrack_DAW1_Grupo7.Repository;

import edu.pe.cibertec.Fastrack_DAW1_Grupo7.Model.bd.TipoEmpleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoEmpleadoRepository extends JpaRepository<TipoEmpleado, Integer> {
}

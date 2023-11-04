package edu.pe.cibertec.Fastrack_DAW1_Grupo7.Service;

import edu.pe.cibertec.Fastrack_DAW1_Grupo7.Model.bd.HistorialPago;
import edu.pe.cibertec.Fastrack_DAW1_Grupo7.Repository.HistorialPagoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HistorialPagoService {

    @Autowired
    private HistorialPagoRepository historialPagoRepository;

    public List<HistorialPago> listar() {
        return historialPagoRepository.findAll();
    }

    public HistorialPago registrar(HistorialPago historialPago) {
        return historialPagoRepository.save(historialPago);
    }
}

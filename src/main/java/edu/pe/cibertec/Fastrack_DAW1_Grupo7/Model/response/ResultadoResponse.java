package edu.pe.cibertec.Fastrack_DAW1_Grupo7.Model.response;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ResultadoResponse {
    private String mensaje;
    private Boolean respuesta;
}

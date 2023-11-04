package edu.pe.cibertec.Fastrack_DAW1_Grupo7.Model.request;
import lombok.Data;
@Data
public class EmpleadoRequest {

     private Integer idempleado;
     private String nombre;
     private String  numerotelefono;
     private String correoelectronico;
     private Integer idtipoempleado;
}

package edu.pe.cibertec.Fastrack_DAW1_Grupo7.Model.request;

import lombok.Data;

@Data
public class UsuarioRequest {


    private Integer idusuario;
    private String nombreusuario;
    private String contra;
    private Integer idempleado;
}
package edu.pe.cibertec.Fastrack_DAW1_Grupo7.Model.request;

import lombok.Data;


@Data
public class LocalRequest {

    private Integer idlocal;
    private String nombrelocal;
    private String direccionlocal;
    private String ciudadlocal;
    private String codigopostal;
    private String telefonolocal;
    private Integer idempleado;

}

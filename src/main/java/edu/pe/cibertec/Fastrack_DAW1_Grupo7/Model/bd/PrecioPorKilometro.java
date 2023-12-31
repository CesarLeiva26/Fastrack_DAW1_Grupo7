package edu.pe.cibertec.Fastrack_DAW1_Grupo7.Model.bd;


import jakarta.persistence.*;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "preciosporkilometro")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PrecioPorKilometro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idprecioporkilometro;

    @Column(name = "tiposervicio", nullable = false)
    private String tipoServicio;

    @Column(name = "tarifaporkilometro")
    private BigDecimal tarifaPorKilometro;

    @Column(name = "fechainicio")
    private Date fechaInicio;

    @Column(name = "fechafin")
    private Date fechaFin;
}
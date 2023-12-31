package edu.pe.cibertec.Fastrack_DAW1_Grupo7.Model.bd;

import jakarta.persistence.*;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;

@Entity
@Table(name = "rutasentrega")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RutaEntrega {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idruta;
    @Column(name = "nombreruta", nullable = false)
    private String nombreRuta;
    @Column(name = "descripcionRuta")
    private String descripcionRuta;
    @Column(name = "distanciatotal")
    private BigDecimal distanciaTotal;
    @Column(name = "duracionestimada")
    private int duracionEstimada;
    @Column(name = "costoruta")
    private BigDecimal costoRuta;
}

package edu.pe.cibertec.Fastrack_DAW1_Grupo7.Model.bd;

import jakarta.persistence.*;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;

@Entity
@Table(name = "detallesordenes")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DetalleOrden {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer iddetalleorden;
    @ManyToOne
    @JoinColumn(name = "idorden", referencedColumnName = "idorden")
    private Orden orden;
}
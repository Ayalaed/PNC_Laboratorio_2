package com.example.pnc_labo02.model;
import jakarta.persistence.*;

@Entity
public class ParticipacionCapacitacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Empleado empleado;

    @ManyToOne
    private Capacitacion capacitacion;

    private boolean aprobado;
    private String comentario;
}
package com.example.pnc_labo02.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class AsignacionProyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Empleado empleado;

    @ManyToOne
    private Proyecto proyecto;

    private LocalDate fechaAsignacion;
    private String rol; // opcional
}

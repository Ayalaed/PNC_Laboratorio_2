package com.example.pnc_labo02.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Mentoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Empleado mentor;

    @ManyToOne
    private Empleado mentoreado;

    private LocalDate fechaInicio;
    private String tipo; // opcional
}

package com.example.pnc_labo02.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class EvaluacionDesempeno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate fecha;
    private int puntaje;
    private String comentario;

    @ManyToOne
    private Empleado empleado;
}

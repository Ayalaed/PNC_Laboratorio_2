package com.example.pnc_labo02.model;

import jakarta.persistence.*;
@Entity
public class UsoTecnologia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Proyecto proyecto;

    @ManyToOne
    private Tecnologia tecnologia;

    private String motivoUso; // opcional
}

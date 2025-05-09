package com.example.pnc_labo02.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Area {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private double tarifa;

    @OneToMany(mappedBy = "area")
    private List<Proyecto> proyectos;
}
package com.example.pnc_labo02.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Tecnologia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String version;

    @OneToMany(mappedBy = "tecnologia")
    private List<UsoTecnologia> usos;
}
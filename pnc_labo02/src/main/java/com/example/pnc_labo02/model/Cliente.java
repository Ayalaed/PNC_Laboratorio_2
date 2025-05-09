package com.example.pnc_labo02.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String industria;
    private String emailContacto;

    @OneToMany(mappedBy = "cliente")
    private List<Proyecto> proyectos;
}

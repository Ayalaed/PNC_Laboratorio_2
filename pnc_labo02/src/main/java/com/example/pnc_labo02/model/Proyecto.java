package com.example.pnc_labo02.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String codigo;
    private String nombre;

    @ManyToOne
    private Area area;

    @ManyToOne
    private Categoria categoria;

    @ManyToOne
    private Cliente cliente;

    @ManyToOne
    private Empleado lider;

    @OneToMany(mappedBy = "proyecto")
    private List<AsignacionProyecto> asignaciones;

    @OneToMany(mappedBy = "proyecto")
    private List<UsoTecnologia> tecnologiasUsadas;
}

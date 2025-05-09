package com.example.pnc_labo02.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Capacitacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String tema;
    private LocalDate fecha;
    private int duracionHoras;

    @OneToMany(mappedBy = "capacitacion")
    private List<ParticipacionCapacitacion> participaciones;
}
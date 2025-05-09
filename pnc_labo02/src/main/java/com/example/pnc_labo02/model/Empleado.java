package com.example.pnc_labo02.model;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String apellido;
    private String email;
    private LocalDate fechaIngreso;
    private String puesto;

    @ManyToOne
    private Departamento departamento;

    @OneToMany(mappedBy = "mentor")
    private List<Mentoria> mentoriasRealizadas;

    @OneToMany(mappedBy = "mentoreado")
    private List<Mentoria> mentoriasRecibidas;

    @OneToMany(mappedBy = "empleado")
    private List<AsignacionProyecto> asignaciones;

    @OneToMany(mappedBy = "lider")
    private List<Proyecto> proyectosLiderados;

    @OneToMany(mappedBy = "empleado")
    private List<ParticipacionCapacitacion> participaciones;

    @OneToMany(mappedBy = "empleado")
    private List<EvaluacionDesempeno> evaluaciones;
}

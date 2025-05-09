package com.example.pnc_labo02.model;

import jakarta.persistence.*;
import java.util.List;
import com.example.pnc_labo02.model.Empleado;

@Entity
public class Departamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    @OneToMany(mappedBy = "departamento")
    private List<Empleado> empleados;
}

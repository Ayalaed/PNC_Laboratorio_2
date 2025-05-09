package com.example.pnc_labo02.controller;

import com.example.pnc_labo02.model.Proyecto;
import com.example.pnc_labo02.service.ProyectoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/proyectos")
public class ProyectoController {

    private final ProyectoService proyectoService;

    public ProyectoController(ProyectoService proyectoService) {
        this.proyectoService = proyectoService;
    }

    // Método JPA
    @GetMapping("/area/{nombre}")
    public List<Proyecto> buscarPorArea(@PathVariable String nombre) {
        return proyectoService.obtenerProyectosPorArea(nombre);
    }

    // JPQL
    @GetMapping("/lider/{nombre}")
    public List<Proyecto> buscarPorLider(@PathVariable String nombre) {
        return proyectoService.obtenerProyectosPorLider(nombre);
    }

    // Query nativa
    @GetMapping("/cliente/{nombre}")
    public List<Proyecto> buscarPorCliente(@PathVariable String nombre) {
        return proyectoService.obtenerProyectosPorClienteNativo(nombre);
    }
}

package com.example.pnc_labo02.controller;

import com.example.pnc_labo02.model.Empleado;
import com.example.pnc_labo02.service.EmpleadoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empleados")
public class EmpleadoController {

    private final EmpleadoService empleadoService;

    public EmpleadoController(EmpleadoService empleadoService) {
        this.empleadoService = empleadoService;
    }

    @GetMapping("/departamento/{nombre}")
    public List<Empleado> porDepartamento(@PathVariable String nombre) {
        return empleadoService.obtenerPorDepartamento(nombre);
    }

    @GetMapping("/puesto")
    public List<Empleado> porPuesto(@RequestParam String puesto) {
        return empleadoService.buscarPorPuesto(puesto);
    }

    @GetMapping("/email")
    public List<Empleado> porEmail(@RequestParam String contiene) {
        return empleadoService.buscarPorEmailFragmento(contiene);
    }
}

package com.example.pnc_labo02.service;

import com.example.pnc_labo02.model.Proyecto;
import com.example.pnc_labo02.repository.ProyectoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProyectoService {

    private final ProyectoRepository proyectoRepository;

    public ProyectoService(ProyectoRepository proyectoRepository) {
        this.proyectoRepository = proyectoRepository;
    }

    public List<Proyecto> obtenerProyectosPorArea(String nombreArea) {
        return proyectoRepository.findByAreaNombre(nombreArea);
    }

    public List<Proyecto> obtenerProyectosPorLider(String nombreLider) {
        return proyectoRepository.buscarProyectosPorNombreLider(nombreLider);
    }

    public List<Proyecto> obtenerProyectosPorClienteNativo(String nombreCliente) {
        return proyectoRepository.buscarProyectosPorClienteNativo(nombreCliente);
    }
}

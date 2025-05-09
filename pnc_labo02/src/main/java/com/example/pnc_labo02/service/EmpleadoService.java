package com.example.pnc_labo02.service;

import com.example.pnc_labo02.model.Empleado;
import com.example.pnc_labo02.repository.EmpleadoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoService {

    private final EmpleadoRepository empleadoRepository;

    public EmpleadoService(EmpleadoRepository empleadoRepository) {
        this.empleadoRepository = empleadoRepository;
    }

    public List<Empleado> obtenerPorDepartamento(String nombreDep) {
        return empleadoRepository.findByDepartamentoNombre(nombreDep);
    }

    public List<Empleado> buscarPorPuesto(String puesto) {
        return empleadoRepository.buscarPorPuesto(puesto);
    }

    public List<Empleado> buscarPorEmailFragmento(String fragmento) {
        return empleadoRepository.buscarPorEmailNativo(fragmento);
    }
}

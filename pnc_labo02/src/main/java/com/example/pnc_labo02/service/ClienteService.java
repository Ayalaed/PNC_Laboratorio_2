package com.example.pnc_labo02.service;

import com.example.pnc_labo02.model.Cliente;
import com.example.pnc_labo02.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public List<Cliente> obtenerPorIndustria(String industria) {
        return clienteRepository.findByIndustria(industria);
    }

    public List<Cliente> buscarPorNombre(String nombre) {
        return clienteRepository.buscarPorNombre(nombre);
    }

    public List<Cliente> buscarPorEmailFragmento(String emailFragmento) {
        return clienteRepository.buscarPorEmailNativo(emailFragmento);
    }
}

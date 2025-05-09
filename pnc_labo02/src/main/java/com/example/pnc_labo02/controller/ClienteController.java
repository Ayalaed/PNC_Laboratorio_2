package com.example.pnc_labo02.controller;

import com.example.pnc_labo02.model.Cliente;
import com.example.pnc_labo02.service.ClienteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping("/industria/{nombre}")
    public List<Cliente> porIndustria(@PathVariable String nombre) {
        return clienteService.obtenerPorIndustria(nombre);
    }

    @GetMapping("/nombre")
    public List<Cliente> porNombre(@RequestParam String nombre) {
        return clienteService.buscarPorNombre(nombre);
    }

    @GetMapping("/email")
    public List<Cliente> porEmail(@RequestParam String contiene) {
        return clienteService.buscarPorEmailFragmento(contiene);
    }
}

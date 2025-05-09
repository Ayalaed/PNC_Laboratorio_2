package com.example.pnc_labo02.repository;


import com.example.pnc_labo02.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    List<Cliente> findByIndustria (String industria);
}

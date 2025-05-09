package com.example.pnc_labo02.repository;


import com.example.pnc_labo02.model.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProyectoRepository extends JpaRepository<Proyecto, Long> {
    List<Proyecto> findByAreaNombre(String nombreArea);
    List<Proyecto> findByCategoriaNombre(String nombreCategoria);
}

package com.example.pnc_labo02.repository;

import com.example.pnc_labo02.model.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProyectoRepository extends JpaRepository<Proyecto, Long> {

    // Método JPA: Por nombre del área
    List<Proyecto> findByAreaNombre(String nombreArea);

    // JPQL (query híbrida): Por nombre del líder
    @Query("SELECT p FROM Proyecto p WHERE p.lider.nombre = :nombreLider")
    List<Proyecto> buscarProyectosPorNombreLider(String nombreLider);

    // Native Query: Proyectos por nombre de cliente
    @Query(value = "SELECT * FROM proyecto p JOIN cliente c ON p.cliente_id = c.id WHERE c.nombre = :nombreCliente", nativeQuery = true)
    List<Proyecto> buscarProyectosPorClienteNativo(String nombreCliente);
}

package com.example.pnc_labo02.repository;

import com.example.pnc_labo02.model.Departamento;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface DepartamentoRepository extends JpaRepository<Departamento, Long> {

    List<Departamento> findByNombre(String nombre);

    @Query("SELECT d FROM Departamento d WHERE d.nombre LIKE %:nombre%")
    List<Departamento> buscarPorNombre(String nombre);

    @Query(value = "SELECT * FROM departamento WHERE nombre LIKE %?1%", nativeQuery = true)
    List<Departamento> buscarNombreNativo(String nombre);
}
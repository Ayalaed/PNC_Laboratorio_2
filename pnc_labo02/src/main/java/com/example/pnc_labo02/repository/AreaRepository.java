package com.example.pnc_labo02.repository;

import com.example.pnc_labo02.model.Area;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AreaRepository extends JpaRepository<Area, Long> {

    List<Area> findByTarifa(double tarifa);

    @Query("SELECT a FROM Area a WHERE a.nombre LIKE %:nombre%")
    List<Area> buscarPorNombre(@Param("nombre") String nombre);

    @Query(value = "SELECT * FROM area WHERE nombre = ?1", nativeQuery = true)
    List<Area> buscarPorNombreNativo(String nombre);
}
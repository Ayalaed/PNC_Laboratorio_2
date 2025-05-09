package com.example.pnc_labo02.repository;

import com.example.pnc_labo02.model.Capacitacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface CapacitacionRepository extends JpaRepository<Capacitacion, Long> {

    List<Capacitacion> findByTema(String tema);

    @Query("SELECT c FROM Capacitacion c WHERE c.fecha = :fecha")
    List<Capacitacion> buscarPorFecha(@Param("fecha") LocalDate fecha);

    @Query(value = "SELECT * FROM capacitacion WHERE duracion_horas >= ?1", nativeQuery = true)
    List<Capacitacion> buscarPorDuracionNativa(int horas);
}
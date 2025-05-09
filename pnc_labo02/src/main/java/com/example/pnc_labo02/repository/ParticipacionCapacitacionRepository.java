package com.example.pnc_labo02.repository;

import com.example.pnc_labo02.model.ParticipacionCapacitacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ParticipacionCapacitacionRepository extends JpaRepository<ParticipacionCapacitacion, Long> {

    List<ParticipacionCapacitacion> findByEmpleadoId(Long empleadoId);

    @Query("SELECT p FROM ParticipacionCapacitacion p WHERE p.aprobado = true")
    List<ParticipacionCapacitacion> buscarAprobadas();

    @Query(value = "SELECT * FROM participacion_capacitacion WHERE aprobado = true", nativeQuery = true)
    List<ParticipacionCapacitacion> buscarAprobadasNativas();
}
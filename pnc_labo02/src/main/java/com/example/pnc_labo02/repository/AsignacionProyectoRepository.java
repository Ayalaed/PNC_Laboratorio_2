package com.example.pnc_labo02.repository;

import com.example.pnc_labo02.model.AsignacionProyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AsignacionProyectoRepository extends JpaRepository<AsignacionProyecto, Long> {

    List<AsignacionProyecto> findByEmpleadoId(Long empleadoId);

    @Query("SELECT a FROM AsignacionProyecto a WHERE a.rol = :rol")
    List<AsignacionProyecto> buscarPorRol(@Param("rol") String rol);

    @Query(value = "SELECT * FROM asignacion_proyecto WHERE rol = ?1", nativeQuery = true)
    List<AsignacionProyecto> buscarPorRolNativo(String rol);
}
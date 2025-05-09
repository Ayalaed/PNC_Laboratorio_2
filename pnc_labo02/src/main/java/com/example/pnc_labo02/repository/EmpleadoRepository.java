package com.example.pnc_labo02.repository;

import com.example.pnc_labo02.model.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {

    // Método JPA
    List<Empleado> findByDepartamentoNombre(String nombre);

    // Query híbrida (JPQL)
    @Query("SELECT e FROM Empleado e WHERE e.puesto LIKE %:puesto%")
    List<Empleado> buscarPorPuesto(String puesto);

    // Query nativa
    @Query(value = "SELECT * FROM empleado WHERE email LIKE %?1%", nativeQuery = true)
    List<Empleado> buscarPorEmailNativo(String fragmentoEmail);
}

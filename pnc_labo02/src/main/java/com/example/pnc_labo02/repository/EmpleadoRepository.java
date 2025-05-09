package com.example.pnc_labo02.repository;

import com.example.pnc_labo02.model.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {
    List<Empleado> findByApellido(String apellido);

    Optional<Empleado> findByEmail(String email);
}

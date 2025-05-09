package com.example.pnc_labo02.repository;

import com.example.pnc_labo02.model.EvaluacionDesempeno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface EvaluacionDesempenoRepository extends JpaRepository<EvaluacionDesempeno, Long> {

    List<EvaluacionDesempeno> findByEmpleadoId(Long empleadoId);

    @Query("SELECT e FROM EvaluacionDesempeno e WHERE e.puntaje >= :puntaje")
    List<EvaluacionDesempeno> buscarPorPuntajeMayorIgual(@Param("puntaje") int puntaje);

    @Query(value = "SELECT * FROM evaluacion_desempeno WHERE puntaje >= ?1", nativeQuery = true)
    List<EvaluacionDesempeno> buscarPuntajeNativo(int puntaje);
}
package com.example.pnc_labo02.repository;

import com.example.pnc_labo02.model.UsoTecnologia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UsoTecnologiaRepository extends JpaRepository<UsoTecnologia, Long> {

    List<UsoTecnologia> findByProyectoId(Long proyectoId);

    @Query("SELECT u FROM UsoTecnologia u WHERE u.motivoUso LIKE %:motivo%")
    List<UsoTecnologia> buscarPorMotivo(@Param("motivo") String motivo);

    @Query(value = "SELECT * FROM uso_tecnologia WHERE motivo_uso LIKE %?1%", nativeQuery = true)
    List<UsoTecnologia> buscarPorMotivoNativo(String motivo);
}
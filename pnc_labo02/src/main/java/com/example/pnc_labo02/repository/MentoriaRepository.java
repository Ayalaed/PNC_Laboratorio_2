package com.example.pnc_labo02.repository;

import com.example.pnc_labo02.model.Mentoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MentoriaRepository extends JpaRepository<Mentoria, Long> {

    List<Mentoria> findByTipo(String tipo);

    @Query("SELECT m FROM Mentoria m WHERE m.mentorId = :mentorId")
    List<Mentoria> buscarPorMentor(@Param("mentorId") Long mentorId);

    @Query(value = "SELECT * FROM mentoria WHERE tipo = ?1", nativeQuery = true)
    List<Mentoria> buscarPorTipoNativo(String tipo);
}
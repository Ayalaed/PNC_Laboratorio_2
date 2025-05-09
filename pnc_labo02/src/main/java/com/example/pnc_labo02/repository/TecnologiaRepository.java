package com.example.pnc_labo02.repository;

import com.example.pnc_labo02.model.Tecnologia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TecnologiaRepository extends JpaRepository<Tecnologia, Long> {

    List<Tecnologia> findByVersion(String version);

    @Query("SELECT t FROM Tecnologia t WHERE t.nombre LIKE %:nombre%")
    List<Tecnologia> buscarPorNombre(@Param("nombre") String nombre);

    @Query(value = "SELECT * FROM tecnologia WHERE nombre = ?1", nativeQuery = true)
    List<Tecnologia> buscarNombreNativo(String nombre);
}
package com.example.pnc_labo02.repository;

import com.example.pnc_labo02.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

    List<Categoria> findByNombre(String nombre);

    @Query("SELECT c FROM Categoria c WHERE c.nombre LIKE %:nombre%")
    List<Categoria> buscarPorNombre(@Param("nombre") String nombre);

    @Query(value = "SELECT * FROM categoria WHERE nombre = ?1", nativeQuery = true)
    List<Categoria> buscarNombreNativo(String nombre);
}
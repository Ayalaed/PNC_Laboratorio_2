package com.example.pnc_labo02.repository;

import com.example.pnc_labo02.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    // Método JPA
    List<Cliente> findByIndustria(String industria);

    // Query híbrida (JPQL)
    @Query("SELECT c FROM Cliente c WHERE c.nombre LIKE %:nombre%")
    List<Cliente> buscarPorNombre(String nombre);

    // Query nativa
    @Query(value = "SELECT * FROM cliente WHERE email_contacto LIKE %?1%", nativeQuery = true)
    List<Cliente> buscarPorEmailNativo(String emailFragmento);
}

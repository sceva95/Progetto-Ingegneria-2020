package com.example.prova.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LibroRepository extends JpaRepository<Libro, String> {

    List<Libro> findByGenereOrderByPosizioneAsc(String genere);

    List<Libro> findByGenereOrderByVenditeDesc(String genere);
}

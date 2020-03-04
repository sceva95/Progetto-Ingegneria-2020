package com.example.prova.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContattoRepository extends JpaRepository<Contatto, ContattoId> {
    List<Contatto> findById_Email(String email);
}

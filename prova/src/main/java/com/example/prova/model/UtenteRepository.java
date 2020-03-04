package com.example.prova.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UtenteRepository extends JpaRepository<Utente, String> {

    List<Utente> findByEmail(String email);
    List<Utente> findByPermessi(String permessi2);
}
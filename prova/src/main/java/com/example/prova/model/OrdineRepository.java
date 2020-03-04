package com.example.prova.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrdineRepository extends JpaRepository<Ordine, Integer> {
    List<Ordine> findByEmail(String email);
    List<Ordine> findByIdentificativo(int id);
}

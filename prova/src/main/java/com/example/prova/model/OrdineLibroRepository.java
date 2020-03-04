package com.example.prova.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrdineLibroRepository extends JpaRepository<OrdineLibro, OrdineLibroId> {
    List<OrdineLibro> findById(int id);
    List<OrdineLibro> findById_Id(int id);
}
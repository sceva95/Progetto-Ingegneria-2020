package com.example.prova.controller;

import com.example.prova.model.OrdineLibro;
import com.example.prova.model.OrdineLibroId;
import com.example.prova.model.OrdineLibroRepository;
import org.hibernate.loader.plan.exec.process.spi.ReturnReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Controller
public class OrdineLibroController {

    @Autowired
    private OrdineLibroRepository ordineLibroRepository;

    @Autowired
    private JdbcTemplate jdbcTemplate;


    public List<OrdineLibro> findAll(){
        return ordineLibroRepository.findAll();
    }

    public OrdineLibro findById(OrdineLibroId id){
        Optional<OrdineLibro> result = ordineLibroRepository.findById(id);
        return result.get();
    }

    public List<OrdineLibro> findByIdOrdine(int id){
        return ordineLibroRepository.findById_Id(id);

    }

    public OrdineLibro save(OrdineLibro prova) {
        return ordineLibroRepository.save(prova);
    }
}

package com.example.prova.controller;

import com.example.prova.model.Contatto;
import com.example.prova.model.ContattoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ContattoController {

    @Autowired
    private ContattoRepository contattoRepository;


    public List<Contatto> findAll(){
        return contattoRepository.findAll();
    }

    public List<Contatto> findByEmail(String email){
        return contattoRepository.findById_Email(email);
    }

    public Contatto aggiungi(Contatto prova) {
        return contattoRepository.save(prova);
    }
}

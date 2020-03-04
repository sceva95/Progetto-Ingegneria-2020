package com.example.prova.controller;


import com.example.prova.model.Utente;
import com.example.prova.model.UtenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class UtenteController {

    @Autowired
    private UtenteRepository utenteRepository;


    public List<Utente> findAll() {
        return utenteRepository.findAll();
    }

    public List<Utente> findUtentiRegistrati(String permessi2){
        return utenteRepository.findByPermessi(permessi2);
    }

    public void delete(Utente utente){
        utenteRepository.delete(utente);
    }


    public Utente save(Utente prova) {
        return utenteRepository.save(prova);
    }

    public Utente findById(String id){
        Optional<Utente> utente = utenteRepository.findById(id);
        return utente.get();
    }
}

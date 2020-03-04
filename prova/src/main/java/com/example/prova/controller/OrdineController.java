package com.example.prova.controller;

import com.example.prova.model.Ordine;
import com.example.prova.model.OrdineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class OrdineController {

    @Autowired
    private OrdineRepository ordineRepository;

    public void delete(Ordine ordine){
        ordineRepository.delete(ordine);
    }


    public List<Ordine> findAll(){
        return ordineRepository.findAll();
    }


    public Ordine save(Ordine prova) {
        return ordineRepository.save(prova);
    }

    public List<Ordine> findByEmail(String email){
        return ordineRepository.findByEmail(email);
    }

    public Ordine findById(int id){
        Optional<Ordine> ordine = ordineRepository.findById(id);
        return ordine.get();
    }
}

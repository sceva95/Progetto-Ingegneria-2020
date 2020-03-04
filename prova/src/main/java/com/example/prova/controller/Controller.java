package com.example.prova.controller;

import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Controller
public class Controller {
    @Autowired
    private ContattoController contattoController;

    @Autowired
    private LibroController libroController;

    @Autowired
    private OrdineController ordineController;

    @Autowired
    private  OrdineLibroController ordineLibroController;

    @Autowired
    private UtenteController utenteController;

    public ContattoController getContattoController(){
        return contattoController;
    }
    public LibroController getLibroController(){
        return libroController;
    }
    public OrdineLibroController getOrdineLibroController(){
        return ordineLibroController;
    }
    public OrdineController getOrdineController(){
        return ordineController;
    }
    public UtenteController getUtenteController() {
        return utenteController;
    }
}

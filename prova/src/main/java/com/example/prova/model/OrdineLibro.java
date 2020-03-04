package com.example.prova.model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity(name = "ordinelibro")
public class OrdineLibro {

    @EmbeddedId
    private OrdineLibroId id;

    @Column(name = "quantita")
    private int quantita;

    public OrdineLibro() {
    }

    public OrdineLibroId getId() {
        return id;
    }

    public void setId(OrdineLibroId id) {
        this.id = id;
    }

    public void setQuantita(int quantita) {
        if (quantita < 100)
            this.quantita = quantita;
        else
            throw new IllegalArgumentException("OrdineLibro --> quantita");
    }

    public int getQuantita() {
        return quantita;
    }
}

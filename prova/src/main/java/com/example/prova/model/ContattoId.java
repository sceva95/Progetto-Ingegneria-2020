package com.example.prova.model;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ContattoId implements Serializable {

    private String email;
    private String indirizzo;

    public ContattoId(){}

    public String getEmail() {
        return email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContattoId that = (ContattoId) o;
        return Objects.equals(email, that.email) &&
                Objects.equals(indirizzo, that.indirizzo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, indirizzo);
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

}
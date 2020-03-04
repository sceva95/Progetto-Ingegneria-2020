package com.example.prova.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Entity(name = "UTENTE")
public class Utente {



    @Column(name = "nome")
    private String nome;

    @Column(name = "cognome")
    private String cognome;

    @Column(name = "cap")
    private String cap;

    @Column(name = "citta")
    private String citta;

    @Column(name = "permessi")
    private String permessi;

    @Column(name = "telefono")
    private String telefono;

    @Id
    @Column(name = "email")
    private String email;

    @Column(name = "indirizzo")
    private String indirizzo;

    @Column(name = "password")
    private String password;

    @Column(name = "librocard_id")
    private int libroCardId;

    @Column(name = "librocard_data")
    private Date libroCardData;

    @Column(name = "librocard_punti")
    private int libroCardPunti;

    //GETTERS AND SETTERS

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome.toUpperCase();
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome.toUpperCase();
    }

    public String getCap() {
        return cap;
    }

    public void setCap(String cap) {
        this.cap = cap.toUpperCase();
    }

    public String getCitta() {
        return citta;
    }

    public void setCitta(String citta) {
        this.citta = citta.toUpperCase();
    }

    public String getPermessi() {
        return permessi;
    }

    public void setPermessi(String permessi) {
        final String permessiArray[] = { "GUEST", "RESPONSABILE", "REGISTRATO"};
        if(permessi.toUpperCase().equals(permessiArray[0]) || permessi.toUpperCase().equals(permessiArray[1]) || permessi.toUpperCase().equals(permessiArray[2]))
            this.permessi = permessi.toUpperCase();
        else
            throw new IllegalArgumentException("permessi errato");
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getLibroCardId() {
        return libroCardId;
    }

    public void setLibroCardId(int libroCardId) {
        this.libroCardId = libroCardId;
    }

    public Date getLibroCardData() {
        return libroCardData;
    }

    public void setLibroCardData(Date libroCardData) {
        this.libroCardData = libroCardData;
    }

    public int getLibroCardPunti() {
        return libroCardPunti;
    }

    public void setLibroCardPunti(int libroCardPunti) {
        this.libroCardPunti = libroCardPunti;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono.toUpperCase();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setIndirizzo(String indirizzo){
        this.indirizzo = indirizzo;
    }

    public String getIndirizzo(){return indirizzo;}


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Utente utente = (Utente) o;
        return Objects.equals(nome, utente.nome) &&
                Objects.equals(cognome, utente.cognome) &&
                Objects.equals(cap, utente.cap) &&
                Objects.equals(citta, utente.citta) &&
                Objects.equals(permessi, utente.permessi) &&
                Objects.equals(telefono, utente.telefono) &&
                Objects.equals(email, utente.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cognome, cap, citta, permessi, telefono, email);
    }


}
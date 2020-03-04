package com.example.prova.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Arrays;
import java.util.Objects;

@Entity(name = "libro")
public class Libro {


    @Id
    @Column(name = "isbn")
    private String isbn;

    @Column(name = "titolo")
    private String titolo;

    @Column(name = "autore")
    private String autore;

    @Column(name = "casa_editrice")
    private String casaEditrice;

    @Column(name = "anno")
    private int anno;

    @Column(name = "genere")
    private String genere;

    @Column(name = "prezzo")
    private double prezzo;

    @Column(name = "descrizione")
    private String descrizione;

    @Column(name = "punti")
    private int punti;

    @Column(name = "posizione")
    private int posizione;

    @Column(name = "tempo")
    private int tempo;

    @Column(name = "vendite")
    private int vendite;

    public Libro(){}

    //getter and setters
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn.toUpperCase();
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo.toUpperCase();
    }

    public String getCasaEditrice() {
        return casaEditrice;
    }

    public void setCasaEditrice(String casaEditrice) {
        this.casaEditrice = casaEditrice.toUpperCase();
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        String genereArray[] = {"NARRAZIONE", "AVVENTURA", "NOVITA", "RAGAZZI"};
        for(int x = 0; x <= genereArray.length; x++) {
            if (genere.toUpperCase().equals(genereArray[x])) {
                this.genere = genere.toUpperCase();
                return;
            }
        }

        //se il genere non è presente all'interno dell'array
        throw new IllegalArgumentException("genere errato ");
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public int getPunti() {
        return punti;
    }

    public void setPunti(int punti) {
        this.punti = punti;
    }

    public void setPosizione(int posizione){
        this.posizione = posizione;
    }

    public int getPosizione(){
        return posizione;
    }

    public int getTempo(){return tempo;}

    public void setTempo(int tempo){
        this.tempo = tempo;
    }

    public void setAutore(String autore){
        this.autore = autore;
    }

    public String getAutore(){
        return autore;
    }

    public int getVendite(){
        return vendite;
    }

    public void setVendite(int vendite){
        this.vendite = vendite;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return anno == libro.anno &&
                prezzo == libro.prezzo &&
                punti == libro.punti &&
                posizione == libro.posizione &&
                tempo == libro.tempo &&
                vendite == libro.vendite &&
                Objects.equals(isbn, libro.isbn) &&
                Objects.equals(titolo, libro.titolo) &&
                Objects.equals(autore, libro.autore) &&
                Objects.equals(casaEditrice, libro.casaEditrice) &&
                Objects.equals(genere, libro.genere) &&
                Objects.equals(descrizione, libro.descrizione);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(isbn, titolo, autore, casaEditrice, anno, genere, prezzo, descrizione, punti, posizione, tempo, vendite);
        return result;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "isbn='" + isbn + '\'' +
                ", titolo='" + titolo + '\'' +
                ", autore='" + autore + '\'' +
                ", casaEditrice='" + casaEditrice + '\'' +
                ", anno=" + anno +
                ", genere='" + genere + '\'' +
                ", prezzo=" + prezzo +
                ", descrizione='" + descrizione + '\'' +
                ", punti=" + punti +
                ", posizione=" + posizione +
                ", tempo=" + tempo +
                ", vendite=" + vendite +
                '}';
    }
}

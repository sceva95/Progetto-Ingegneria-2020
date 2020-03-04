package com.example.prova.model;

import javax.persistence.*;
import java.sql.Date;

@Entity(name = "ordine")
public class Ordine {



    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name  = "id")
    private int identificativo;

    @Column(name = "data")
    private Date data;

    @Column(name = "email")
    private String email;

    @Column(name = "costo")
    private double costo;

    @Column(name = "pagamento")
    private String pagamento;

    @Column(name = "punti")
    private int punti;

    @Column(name = "stato")
    private String stato;

    public Ordine(){}

    public int getIdentificativo() {
        return identificativo;
    }

    public void setIdentificativo(int identificativo) {
        this.identificativo = identificativo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getPagamento() {
        return pagamento;
    }

    public void setPagamento(String pagamento) {
        final String PAGAMENTOARRAY[] = {"PAYPAL", "CONTRASSEGNO", "CARTA DI CREDITO"};
        if(pagamento.equalsIgnoreCase(PAGAMENTOARRAY[0]) || pagamento.equalsIgnoreCase(PAGAMENTOARRAY[1]) || pagamento.equalsIgnoreCase(PAGAMENTOARRAY[2]))
            this.pagamento = pagamento.toUpperCase();
        else
            throw new IllegalArgumentException("pagamento errato");
    }

    public int getPunti() {
        return punti;
    }

    public void setPunti(int punti) {
        this.punti = punti;
    }

    public String getStato() {
        return stato;
    }

    public void setStato(String stato) {
        final String STATOARRAY[] = {"IN PREPARAZIONE", "SPEDITO", "CONSEGNATO"};
        if(stato.equalsIgnoreCase(STATOARRAY[0]) || stato.equalsIgnoreCase(STATOARRAY[1]) || stato.equalsIgnoreCase(STATOARRAY[2]))
            this.stato = stato.toUpperCase();
        else
            throw new IllegalArgumentException("stato errato");
    }

    public String toString(){
        String result = "";
        result = "id: " + this.getIdentificativo() + "\n" + "Data: " + this.getData().toString() + "\n" +
                "Costo: " + this.getCosto() + "\n" + "Pagamento: " + this.getPagamento() + "\n" + "Punti: " +
                this.getPunti() + "\n" + "Stato: " + this.getStato();
        return result;
    }
}
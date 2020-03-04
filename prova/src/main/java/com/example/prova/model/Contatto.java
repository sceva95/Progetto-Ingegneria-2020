package com.example.prova.model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity(name = "contatto")
public class Contatto {

        @EmbeddedId
        private ContattoId id;

        @Column(name = "citta")
        private String citta;

        @Column(name = "cap")
        private String cap;

        public Contatto(){}

        public ContattoId getId() {
            return id;
        }

        public void setId(ContattoId id) {
            this.id = id;
        }

        public void setCitta(String citta){
                this.citta = citta;
        }

        public String getCitta() {
                return citta;
        }

        public void setCap(String cap) {
                this.cap = cap;
        }

        public String getCap() {
                return cap;
        }

        public String toString(){
                return id.getIndirizzo() + "-" + citta;
        }
}


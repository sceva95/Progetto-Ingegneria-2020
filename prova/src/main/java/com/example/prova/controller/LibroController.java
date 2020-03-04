package com.example.prova.controller;

import com.example.prova.model.Libro;
import com.example.prova.model.LibroRepository;
import com.example.prova.model.Utente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

//@RestController
//@RequestMapping("/libro")
@Controller
public class LibroController {

    @Autowired
    private LibroRepository libroRepository;

   // @GetMapping("/all")
    public List<Libro> findAll(){
        return libroRepository.findAll();
    }

   // @PostMapping(consumes = "application/json", produces = "application/json")
    public Libro aggiungi(Libro prova) {
        return libroRepository.save(prova);
    }

    public List<Libro> findByGenereOrdinaPosizione(String genere){
        return libroRepository.findByGenereOrderByPosizioneAsc(genere);
    }

    public Libro findById(String isbn){
        Optional<Libro> result = libroRepository.findById(isbn);
        return result.get();
    }

    public void aggiornaClassifiche(Utente connesso, String genere){
        if(connesso.getPermessi().equals("RESPONSABILE")){
            List<Libro> libri = libroRepository.findByGenereOrderByVenditeDesc(genere);
            int pos = 1;
            for(Libro tmp: libri) {
                if(tmp.getPosizione() == pos)
                    tmp.setTempo(tmp.getTempo()+1);
                tmp.setPosizione(pos);
                this.aggiungi(tmp);
                pos++;
            }
        }
    }


}

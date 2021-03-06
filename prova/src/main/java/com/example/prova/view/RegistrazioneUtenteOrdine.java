package com.example.prova.view;

import com.example.prova.controller.OrdineLibroController;
import com.example.prova.model.*;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;

public class RegistrazioneUtenteOrdine extends javax.swing.JPanel {

    /**
     * Creates new form RegistrazioneUtenteOrdine
     */
    private MainWindow main;
    private List<Libro> libri = new ArrayList<>();
    public RegistrazioneUtenteOrdine(MainWindow main, List<Libro> libri) {
        this.main = main;
        this.libri = libri;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pagamentoBox = new javax.swing.JComboBox<>();
        nomeText = new javax.swing.JTextField();
        cognomeText = new javax.swing.JTextField();
        indirizzoText = new javax.swing.JTextField();
        cittaText = new javax.swing.JTextField();
        capText = new javax.swing.JTextField();
        telefonoText = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ordinaButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        jLabel1.setText("Nome:");

        jLabel2.setText("Cognome:");

        jLabel3.setText("Indirizzo:");

        jLabel4.setText("Città:");

        jLabel5.setText("Cap:");

        jLabel6.setText("Telefono:");

        pagamentoBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PAYPAL", "CARTA DI CREDITO", "CONTRASSEGNO" }));




        ordinaButton.setText("Ordina");
        ordinaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordinaButtonActionPerformed(evt);
            }
        });

        jLabel7.setText("E-mail:");

        jLabel8.setText("Pagamento:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(capText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(cittaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(indirizzoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(nomeText, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel7))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(cognomeText)
                                                        .addComponent(emailField)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel8))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(telefonoText)
                                                        .addComponent(pagamentoBox, 0, 1, Short.MAX_VALUE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(21, 21, 21))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(ordinaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(47, 47, 47))))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {capText, cittaText, cognomeText, emailField, indirizzoText, nomeText, telefonoText});

        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(nomeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(cognomeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel7)
                                                        .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(indirizzoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(cittaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(capText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(telefonoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(pagamentoBox, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ordinaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel8))
                                .addGap(34, 34, 34))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel1, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {capText, cittaText, cognomeText, emailField, indirizzoText, nomeText, telefonoText});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>

    private void ordinaButtonActionPerformed(java.awt.event.ActionEvent evt) {
       String nome="";
       String cognome="";
       String email="";
       String indirizzo ="";
       String citta ="";
       String cap ="";
       String telefono="";
       String pagamento = "";
       Ordine nuovo = new Ordine();
       Utente utente = new Utente();
       double prezzo = 0;

       try{
           //riempo i parametri dell'utente
           nome = nomeText.getText();
           cognome = cognomeText.getText();
           email = emailField.getText();
           indirizzo = indirizzoText.getText();
           citta=cittaText.getText();
           cap=capText.getText();
           telefono = telefonoText.getText();
           try{
               if(!main.getController().getUtenteController().findById(email).getPermessi().equals("GUEST") ) {
                   JOptionPane.showMessageDialog(null, "Esiste già un utente registrato con questa E-Mail\nProva a fare il login!");
                   return;
               }
               }catch(Exception e){
                   utente.setEmail(email);
                   utente.setNome(nome);
                   utente.setCognome(cognome);
                   utente.setIndirizzo(indirizzo);
                   utente.setCitta(citta);
                   utente.setCap(cap);
                   utente.setTelefono(telefono);
                   utente.setPermessi("GUEST");
                   main.getController().getUtenteController().save(utente);
               }

           pagamento=pagamentoBox.getSelectedItem().toString();
           nuovo.setEmail(email);
           nuovo.setPagamento(pagamento);
           nuovo.setData(new java.sql.Date(new Date().getTime()));
           nuovo.setStato("IN PREPARAZIONE");
           for(Libro tmp: libri){
               prezzo+=tmp.getPrezzo();
           }
           nuovo.setCosto(prezzo);
           nuovo.setPunti(0);
           main.getController().getOrdineController().save(nuovo);


           //salvo i libri dell'ordine
           OrdineLibro ordineLibro = new OrdineLibro();
           ordineLibro.setQuantita(0);
           OrdineLibroId ordineLibroId = new OrdineLibroId();
           ordineLibroId.setId(nuovo.getIdentificativo());
           for(Libro tmp: libri){
               ordineLibroId.setIsbn(tmp.getIsbn());
               ordineLibro.setId(ordineLibroId);

               //se c'è un solo libro
               try{
                   main.getController().getOrdineLibroController().findById(ordineLibroId);

               }catch(Exception e){
                         ordineLibro.setQuantita(1);
                         main.getController().getOrdineLibroController().save(ordineLibro);
                         Libro libro = new Libro();
                         libro =main.getController().getLibroController().findById(tmp.getIsbn());
                         libro.setVendite(libro.getVendite() + 1);
                         main.getController().getLibroController().aggiungi(libro);
                         continue;
               }

               //se ci sono piu libri
               OrdineLibro old = new OrdineLibro();
               old = main.getController().getOrdineLibroController().findById(ordineLibroId);
               ordineLibro.setQuantita(old.getQuantita() + 1);

               main.getController().getOrdineLibroController().save(ordineLibro);
               Libro libro = new Libro();
               libro =main.getController().getLibroController().findById(tmp.getIsbn());
               libro.setVendite(libro.getVendite() + 1);
               main.getController().getLibroController().aggiungi(libro);
           }
       }catch(Exception e){
           e.printStackTrace();
           JOptionPane.showMessageDialog(null, "Qualcosa è andato storto");
           //rollback
           main.getController().getOrdineController().delete(nuovo);
           main.getController().getUtenteController().delete(utente);
           main.setVisible(true);
           return;
       }
        JOptionPane.showMessageDialog(null, "Ordine Effettuato!\nID ordine: " + nuovo.getIdentificativo() + "\nCosto: " + nuovo.getCosto()  );
        main.setVisible(true);
        return;
    }


    // Variables declaration - do not modify
    private javax.swing.JTextField capText;
    private javax.swing.JTextField cittaText;
    private javax.swing.JTextField cognomeText;
    private javax.swing.JTextField emailField;
    private javax.swing.JTextField indirizzoText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nomeText;
    private javax.swing.JButton ordinaButton;
    private javax.swing.JComboBox<String> pagamentoBox;
    private javax.swing.JTextField telefonoText;
    // End of variables declaration
}

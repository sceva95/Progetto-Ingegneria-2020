package com.example.prova.view;

import com.example.prova.controller.Controller;
import com.example.prova.controller.LibroController;
import com.example.prova.controller.OrdineController;
import com.example.prova.controller.UtenteController;
import com.example.prova.model.Libro;
import com.example.prova.model.Ordine;
import com.example.prova.model.Utente;
import org.springframework.stereotype.Component;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class MainWindow extends javax.swing.JFrame {

    private Controller controller;

    private MainWindow main;
    private Utente utenteCorrente;
    private List<Libro> libri = new ArrayList<>();
    private double prezzoTotale = 0;
    private String resoconto ="";

    /**
     * Creates new form MainWindow
     */
    public MainWindow(final Controller controller) {
       this.controller = controller;
       //aggiungiLibri();
       libri = this.controller.getLibroController().findAll();

       initComponents();
       updateTable();
    }

    public List<Libro> getLibri(){return libri;}
    public Controller getController() {
        return controller;
    }

    public Utente getUtenteCorrente() {
        return utenteCorrente;
    }

    public void setUtenteCorrente(Utente utenteCorrente) {
        this.utenteCorrente = utenteCorrente;
    }

    public MainWindow getMain() {
        return main;
    }

    public void setMain(MainWindow main) {
        this.main = main;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        libriSelezionatiTabella = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        resocontoTextArea = new javax.swing.JTextArea();
        ordinaButton = new javax.swing.JButton();
        idText = new javax.swing.JTextField();
        idLabel = new javax.swing.JLabel();
        cercaButton = new javax.swing.JButton();
        rimuoviButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        genereBox = new javax.swing.JComboBox<>();
        genereButton = new javax.swing.JButton();
        aggiungiButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        emailLabel = new javax.swing.JLabel();
        emailText = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        registratiButton = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        libriTabella = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Libreria");
        setPreferredSize(new java.awt.Dimension(1300, 600));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 989, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );

        libriSelezionatiTabella.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "Titolo", "Autore", "Casa_editrice", "ISBN", "Prezzo", "Punti"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        });

        jScrollPane2.setViewportView(libriSelezionatiTabella);

        resocontoTextArea.setColumns(20);
        resocontoTextArea.setRows(5);
        resocontoTextArea.setEditable(false);
        jScrollPane3.setViewportView(resocontoTextArea);

        ordinaButton.setText("Ordina");
        ordinaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordinaButtonActionPerformed(evt);
            }
        });

        idLabel.setText("ID Ordine:");

        cercaButton.setText("Cerca");
        cercaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cercaButtonActionPerformed(evt);
            }
        });

        rimuoviButton.setText("Rimuovi");
        rimuoviButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rimuoviButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("GENERE:");

        genereBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TUTTI", "NARRAZIONE", "AVVENTURA", "NOVITA", "RAGAZZI" }));


        genereButton.setText("Visualizza Classifica");
        genereButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genereButtonActionPerformed(evt);
            }
        });

        aggiungiButton.setText("Aggiungi");
        aggiungiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aggiungiButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("CARRELLO");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
                jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel8Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(rimuoviButton)
                                                .addGap(235, 235, 235)
                                                .addComponent(idLabel))
                                        .addGroup(jPanel8Layout.createSequentialGroup()
                                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 857, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(idText, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                                        .addComponent(jScrollPane3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(ordinaButton)
                                        .addComponent(cercaButton))
                                .addGap(95, 95, 95))
                        .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(genereBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(genereButton)
                                .addGap(373, 373, 373)
                                .addComponent(aggiungiButton)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
                jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(genereBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(genereButton)
                                        .addComponent(aggiungiButton))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel8Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel8Layout.createSequentialGroup()
                                                .addComponent(ordinaButton)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(jScrollPane3))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(idText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cercaButton)
                                        .addComponent(idLabel)
                                        .addComponent(rimuoviButton))
                                .addGap(38, 38, 38))
        );

        emailLabel.setText("E-Mail: ");

        passwordLabel.setText("Password: ");

        loginButton.setText("LOGIN");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        registratiButton.setText("REGISTRATI");
        registratiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registratiButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(emailLabel)
                                        .addComponent(emailText, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(passwordLabel)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(registratiButton)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(loginButton))
                                                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {emailLabel, passwordLabel});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {loginButton, registratiButton});

        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(emailLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(emailText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(passwordLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(registratiButton)
                                        .addComponent(loginButton))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        libriTabella.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null}
                },
                new String [] {
                        "Titolo", "Autore", "Casa Editrice", "Anno", "Genere", "Prezzo", "Descrizione", "ISBN", "Punti", "Posizione", "Settimane"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        });
        jScrollPane1.setViewportView(libriTabella);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("CATALOGO LIBRI");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                                                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(0, 43, Short.MAX_VALUE))
                                                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                                                                .addContainerGap()
                                                                                .addComponent(jScrollPane1)))
                                                                .addGap(18, 18, 18))
                                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(10, 10, 10)
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {
        String email ="";
        try{
            email = emailText.getText();
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Email o Password non inserite");
            return;
        }
        Utente corrente = null;
        try{
            corrente = controller.getUtenteController().findById(email);
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Email inesistente");
            return;
        }
        try {
            if (isPasswordCorrect(jPasswordField1.getPassword(), corrente.getPassword())) {
                this.setUtenteCorrente(corrente);
                JOptionPane.showMessageDialog(null, "Benvenuto!");
                this.setVisible(false);
                new MainWindowLoggato(this).setVisible(true);

            } else {
                JOptionPane.showMessageDialog(null, "Email o Password errati");
                return;
            }
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Email o Password non inserite");
            return;
        }
    }

    private static Boolean isPasswordCorrect(char[] input, String password) {
        boolean isCorrect = true;
        char[] correctPassword = new char[password.length()];

        // Copy character by character into array
        for (int i = 0; i < password.length(); i++) {
            correctPassword[i] = password.charAt(i);
        }
        if (input.length != correctPassword.length) {
            isCorrect = false;
        } else {
            isCorrect = Arrays.equals (input, correctPassword);
        }
        //Zero out the password.
        Arrays.fill(correctPassword,'0');
        return isCorrect;
    }

    private void aggiungiButtonActionPerformed(java.awt.event.ActionEvent evt) {
        //aggiungere righe selezionate da tabella libri a tabella selezionati


        TableModel model = libriTabella.getModel();
        int[] indexs = libriTabella.getSelectedRows();
        Object[] row = new Object[6]; //inserire dimensione
        DefaultTableModel model2 = (DefaultTableModel)libriSelezionatiTabella.getModel();
        String text = "";
        for(int i = 0; i < indexs.length; i++){
            row[0] = model.getValueAt(indexs[i], 0); //titolo
            row[1] = model.getValueAt(indexs[i], 1); //autore
            row[2] = model.getValueAt(indexs[i], 2); //casa_editrice
            row[3] = model.getValueAt(indexs[i], 7); //isbn
            row[4] = model.getValueAt(indexs[i], 5); //prezzo
            row[5] = model.getValueAt(indexs[i], 8); //punti
            prezzoTotale+= (Double)model.getValueAt(indexs[i], 5);
            model2.addRow(row);
        }
        double tot = Math.round(prezzoTotale*100.0)/100.0;
        resoconto = "Dati ordine: \nTotale Libri Inseriti :" + (libriSelezionatiTabella.getRowCount()) +
                "\nPrezzo totale : " + tot;
        resocontoTextArea.setText(resoconto);
    }

    private void registratiButtonActionPerformed(java.awt.event.ActionEvent evt) {
        //this.setVisible(false);
        new DefaultJDialog(new RegistrazioneUtente(this), "Registrazione Utente");
        if(utenteCorrente != null){
            this.setVisible(false);
        }

    }

    private void ordinaButtonActionPerformed(java.awt.event.ActionEvent evt) {
        if(this.getUtenteCorrente() == null) {
            List<Libro> libri = new ArrayList<>();
            DefaultTableModel dm = (DefaultTableModel) libriSelezionatiTabella.getModel();
            int rowCount = dm.getRowCount();
            for (int i = rowCount - 1; i >= 0; i--) {
                try {
                    String isbn = (String) libriSelezionatiTabella.getValueAt(i, 3);
                    String genere = this.getController().getLibroController().findById(isbn).getGenere();
                    double prezzo = (Double) libriSelezionatiTabella.getValueAt(i, 4);
                    int punti = (Integer) libriSelezionatiTabella.getValueAt(i, 5);
                    Libro libro = new Libro();
                    libro.setIsbn(isbn);
                    libro.setPunti(punti);
                    libro.setPrezzo(prezzo);
                    libro.setGenere(genere);
                    libri.add(libro);
                }catch(Exception e){
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Qualcosa è andato storto!");
                    return;
                }
            }
            new DefaultJDialog(new RegistrazioneUtenteOrdine(this, libri));


        }
    }

    private void cercaButtonActionPerformed(java.awt.event.ActionEvent evt) {
        int id = 0;
        try{
            id = Integer.parseInt(idText.getText());
        }catch (Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Inserisci un ID");
            return;
        }
        Ordine ordine = null;
        try{
            ordine = controller.getOrdineController().findById(id);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Ordine non trovato!");
            return;
        }
        JOptionPane.showMessageDialog(null, ordine.toString());
    }

    private void genereButtonActionPerformed(java.awt.event.ActionEvent evt) {
        String genere = genereBox.getSelectedItem().toString().toUpperCase();
        if(genere.equalsIgnoreCase("tutti")) {
            libri = main.getController().getLibroController().findAll();
            updateTable();
            return;
        }
        List<Libro> ordinati = new ArrayList<>();
        libri = this.getController().getLibroController().findByGenereOrdinaPosizione(genere);
        updateTableGenere(genere);
    }

    private void rimuoviButtonActionPerformed(java.awt.event.ActionEvent evt) {
        DefaultTableModel dm = (DefaultTableModel) libriSelezionatiTabella.getModel();
        int rowCount = libriSelezionatiTabella.getSelectedRow();
        prezzoTotale -= (Double) libriSelezionatiTabella.getValueAt(rowCount, 4);
        dm.removeRow(rowCount);

        double tot = Math.round(prezzoTotale*100.0)/100.0;
        resoconto = "Dati ordine: \nTotale Libri Inseriti :" + (libriSelezionatiTabella.getRowCount()) +
                "\nPrezzo totale : " + tot;
        resocontoTextArea.setText(resoconto);

    }

    public void setLibri(List<Libro> libri){
        this.libri = libri;
        updateTable();
    }

    public void updateTable(){
        int count = 0;
        DefaultTableModel dm = (DefaultTableModel) libriTabella.getModel();
        int rowCount = dm.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            dm.removeRow(i);
        }
        for(Libro tmp: libri){
            dm.addRow(new Object[]{tmp.getTitolo()});

            libriTabella.setValueAt(tmp.getTitolo(), count,0);
            libriTabella.setValueAt(tmp.getAutore(), count,1);
            libriTabella.setValueAt(tmp.getCasaEditrice(), count,2);
            libriTabella.setValueAt(tmp.getAnno(), count,3);
            libriTabella.setValueAt(tmp.getGenere(), count, 4);
            libriTabella.setValueAt(tmp.getPrezzo(), count,5);
            libriTabella.setValueAt(tmp.getDescrizione(), count,6);
            libriTabella.setValueAt(tmp.getIsbn(), count, 7);
            libriTabella.setValueAt(tmp.getPunti(), count, 8);
            libriTabella.setValueAt(tmp.getPosizione(), count,9);
            libriTabella.setValueAt(tmp.getTempo(), count,10);
            count++;
        }
    }

    private void updateTableGenere(String genere){
        int count = 0;
        DefaultTableModel dm = (DefaultTableModel) libriTabella.getModel();
        int rowCount = dm.getRowCount();
        //Remove rows one by one from the end of the table
        for (int i = rowCount - 1; i >= 0; i--) {
            dm.removeRow(i);
        }
            for(Libro tmp: libri){
                if(tmp.getGenere().equals(genere)) {
                    dm.addRow(new Object[]{tmp.getTitolo()});
                    libriTabella.setValueAt(tmp.getTitolo(), count, 0);
                    libriTabella.setValueAt(tmp.getAutore(), count, 1);
                    libriTabella.setValueAt(tmp.getCasaEditrice(), count, 2);
                    libriTabella.setValueAt(tmp.getAnno(), count, 3);
                    libriTabella.setValueAt(tmp.getGenere(), count, 4);
                    libriTabella.setValueAt(tmp.getPrezzo(), count, 5);
                    libriTabella.setValueAt(tmp.getDescrizione(), count, 6);
                    libriTabella.setValueAt(tmp.getIsbn(), count, 7);
                    libriTabella.setValueAt(tmp.getPunti(), count, 8);
                    libriTabella.setValueAt(tmp.getPosizione(), count, 9);
                    libriTabella.setValueAt(tmp.getTempo(), count, 10);
                    count++;
                }
            }

    }

    private void aggiungiLibri(){
       Libro uno = new Libro();
       Libro due = new Libro();
       Libro tre = new Libro();
       Libro quattro = new Libro();
       Libro cinque = new Libro();
        uno.setIsbn("121212121212");
        uno.setGenere("NARRAZIONE");
        due.setIsbn("111111111111");
        due.setGenere("NARRAZIONE");
        tre.setIsbn("222222222222");
        tre.setGenere("NARRAZIONE");
        quattro.setIsbn("34343434343");
        quattro.setGenere("NARRAZIONE");
        cinque.setIsbn("121212121212");
        cinque.setGenere("NARRAZIONE");
        controller.getLibroController().aggiungi(uno);
        controller.getLibroController().aggiungi(due);
        controller.getLibroController().aggiungi(tre);
        controller.getLibroController().aggiungi(quattro);
        controller.getLibroController().aggiungi(cinque);


    }


    private javax.swing.JButton aggiungiButton;
    private javax.swing.JButton cercaButton;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailText;
    private javax.swing.JComboBox<String> genereBox;
    private javax.swing.JButton genereButton;
    private javax.swing.JLabel idLabel;
    private javax.swing.JTextField idText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable libriSelezionatiTabella;
    private javax.swing.JTable libriTabella;
    private javax.swing.JButton loginButton;
    private javax.swing.JButton ordinaButton;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JButton registratiButton;
    private javax.swing.JTextArea resocontoTextArea;
    private javax.swing.JButton rimuoviButton;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration
}

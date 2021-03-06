package com.example.prova.view;

import javax.swing.*;

/*
    Classe adibita a a fornire un jDialog pronto all'uso
 */
public class DefaultJDialog extends JDialog {

    public DefaultJDialog(JPanel contenuto) {
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setModal(true);
        setContentPane(contenuto);
        pack();
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public DefaultJDialog(JPanel contenuto, String titolo) {
        setTitle(titolo);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setModal(true);
        setContentPane(contenuto);
        pack();
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }

}

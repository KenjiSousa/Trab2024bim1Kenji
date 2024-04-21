package org.example.janelaprincipal;

import javax.swing.*;
import java.awt.*;

public class Janela extends JFrame {
    public Janela() {
        setTitle("Métodos de Ordenação");
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        CheckboxesMetodos checkboxesMetodos = new CheckboxesMetodos();

        PainelTamanhoLista painelTamanhoLista = new PainelTamanhoLista();

        ListaOrigem listaOrigem = new ListaOrigem(); //Lista origem onde o usuário pode digitar os valores da lista a ser ordenada
        painelTamanhoLista.setListenerAlteraLista(listaOrigem);

        Container principal = getContentPane();
        principal.setLayout(new GridLayout(5, 1));
        principal.add(checkboxesMetodos);
        principal.add(painelTamanhoLista);
        principal.add(listaOrigem);
        principal.add(new PreencheRandom(listaOrigem));
        principal.add(new BtnExecutar(listaOrigem, checkboxesMetodos));

        pack();
        setLocationRelativeTo(null); //Centraliza a janela
        setVisible(true);
    }
}

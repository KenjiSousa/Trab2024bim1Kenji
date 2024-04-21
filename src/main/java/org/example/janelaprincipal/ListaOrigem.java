package org.example.janelaprincipal;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ListaOrigem extends JScrollPane {
    private final JPanel painel;
    private final ArrayList<CustomSpinner> spinners = new ArrayList<>();
    public ListaOrigem() {
        painel = new JPanel(new GridLayout());
        //Começa com um elemento na array, correspondendo ao valor inicial do spinner em PainelTamanhoLista
        addSpinner();
        setViewportView(painel);
        setPreferredSize(new Dimension(500, 45));
    }

    public int getSpinnerCount() {
        return spinners.size();
    }

    public ArrayList<CustomSpinner> getSpinners() {
        return spinners;
    }

    public void addSpinner() {
        spinners.add(new CustomSpinner(0, Integer.MIN_VALUE, Integer.MAX_VALUE, false));
        painel.add(spinners.getLast());
    }

    public void removeSpinner() {
        painel.remove(painel.getComponentCount() - 1);
        spinners.removeLast();
    }

    /**
     * Os campos onde o usuário informa os valores da lista são objetos JSpinner, e não podem ser utilizados
     * diretamente nos métodos de ordenação.
     * @return Array de integer pronta para ser processada pelos métodos de ordenação
     */
    public int[] getVetor() {
        int[] vetor = new int[spinners.size()];

        for (int i = 0; i < spinners.size(); i++) {
            vetor[i] = (Integer) spinners.get(i).getValue();
        }

        return vetor;
    }
}

package org.example.janelaprincipal;

import javax.swing.*;

public class PainelTamanhoLista extends JPanel {
    private final JSpinner spinner;
    public PainelTamanhoLista() {
        spinner = new CustomSpinner(1, 1, Integer.MAX_VALUE, true);
        JLabel jLabel = new JLabel("Tamanho da lista: ");
        add(jLabel);
        add(spinner);
    }

    /**
     * Adiciona um ChangeListener para alterar a quantidade de campos no painel de lista.
     * Se o usuário aumentar o tamanho da lista, novos campos são criados.
     * Se o tamanho da lista for reduzido, os últimos campos são removidos.
     * @param lista Painel contendo a lista de campos que será afetado pelo método
     */
    public void setListenerAlteraLista(ListaOrigem lista) {
        spinner.addChangeListener(e -> {
            int diff = (Integer) spinner.getValue() - lista.getSpinnerCount();

            if (diff > 0) {
                for (int i = 0; i < diff; i++) {
                    lista.addSpinner();
                }
            } else if (diff < 0) {
                for (int i = 0; i > diff; i--) {
                    lista.removeSpinner();
                }
            }

            lista.revalidate();
            lista.repaint(); //Atualiza os gráficos ao alterar a quantidade de componentes
        });
    }
}

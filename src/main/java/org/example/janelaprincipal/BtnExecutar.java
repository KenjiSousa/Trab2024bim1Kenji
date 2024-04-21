package org.example.janelaprincipal;

import org.example.ordenacao.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class BtnExecutar extends JPanel {
    public BtnExecutar(ListaOrigem listaOrigem, CheckboxesMetodos checkboxesMetodos) {
        JButton btnExecutar = new JButton(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!(checkboxesMetodos.insercao() || checkboxesMetodos.selecao() || checkboxesMetodos.bolha())) {
                    JOptionPane.showMessageDialog(null, "Ao menos um dos métodos precisa estar selecionado.");
                    return;
                }

                int[] listaOrig = listaOrigem.getVetor();
                int[] listaDest = new int[0];

                String msg = "Lista original: " + Arrays.toString(listaOrig) + "\n\n";

                long tempoInsercao = 0, tempoSelecao = 0, tempoBolha = 0;
                if (checkboxesMetodos.insercao()) {
                    listaDest = Insercao.ordenar(listaOrig);
                    tempoInsercao = Insercao.calculaTempo();
                    System.out.println(tempoInsercao);
                }
                if (checkboxesMetodos.selecao()) {
                    listaDest = Selecao.ordenar(listaOrig);
                    tempoSelecao = Insercao.calculaTempo();
                }
                if (checkboxesMetodos.bolha()) {
                    listaDest = Bolha.ordenar(listaOrig);
                    tempoBolha = Insercao.calculaTempo();
                }

                msg += "Lista Ordenada: " + Arrays.toString(listaDest) + "\n\n";

                if (checkboxesMetodos.insercao()) {
                    msg += "Tempo de execução do método de inserção: ";
                    msg += String.format("%02d:%02d.%04d",
                            TimeUnit.MILLISECONDS.toMinutes(tempoInsercao),
                            TimeUnit.MILLISECONDS.toSeconds(tempoInsercao) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(tempoInsercao)),
                            tempoInsercao % 1000
                    );
                    msg += "\n";
                }
                if (checkboxesMetodos.selecao()) {
                    msg += "Tempo de execução do método de seleção: ";
                    msg += String.format("%02d:%02d.%04d",
                            TimeUnit.MILLISECONDS.toMinutes(tempoSelecao),
                            TimeUnit.MILLISECONDS.toSeconds(tempoSelecao) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(tempoSelecao)),
                            tempoSelecao % 1000
                    );
                    msg += "\n";
                }
                if (checkboxesMetodos.bolha()) {
                    msg += "Tempo de execução do método bolha: ";
                    msg += String.format("%02d:%02d.%04d",
                            TimeUnit.MILLISECONDS.toMinutes(tempoBolha),
                            TimeUnit.MILLISECONDS.toSeconds(tempoBolha) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(tempoBolha)),
                            tempoBolha % 1000
                    );
                    msg += "\n";
                }

                JOptionPane.showMessageDialog(null, msg);
            }
        });

        btnExecutar.setText("Executar");

        add(btnExecutar);
    }
}

package org.example.janelaprincipal;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.Random;

public class PreencheRandom extends JPanel {
    private CustomSpinner vlMin;
    private CustomSpinner vlMax;
    public PreencheRandom(ListaOrigem listaOrigem) {
        JButton btnPreencheRandom = new JButton(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (CustomSpinner spinner : listaOrigem.getSpinners()) {
                    spinner.setValue(new Random().nextInt((Integer) vlMin.getValue(), (Integer) vlMax.getValue()) + 1);
                }
            }
        });

        btnPreencheRandom.setText("Preencher com valores aleatórios");

        vlMin = new CustomSpinner(1, Integer.MIN_VALUE, Integer.MAX_VALUE, true);
        vlMax = new CustomSpinner(100, Integer.MIN_VALUE, Integer.MAX_VALUE, true);

        add(btnPreencheRandom);
        add(new JLabel("de"));
        add(vlMin);
        add(new JLabel("até"));
        add(vlMax);
    }
}

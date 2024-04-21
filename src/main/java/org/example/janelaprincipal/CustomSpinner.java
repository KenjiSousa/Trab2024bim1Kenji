package org.example.janelaprincipal;

import javax.swing.*;
import javax.swing.plaf.basic.BasicSpinnerUI;
import java.awt.*;

public class CustomSpinner extends JSpinner {
    /**
     * Cria um spinner numérico customizado.
     * @param valorDefault Valor inicial
     * @param valorMin     Mínimo valor permitido
     * @param valorMax     Máximo valor permitido
     * @param temBotoes    Se for <code>false</code>, omite os botões que controlam o valor do spinner
     */
    public CustomSpinner(int valorDefault, int valorMin, int valorMax, boolean temBotoes) {
        setModel(new SpinnerNumberModel(valorDefault, valorMin, valorMax, 1));
        setPreferredSize(new Dimension(50, 26));

        if (!temBotoes) {
            setUI(new BasicSpinnerUI() {
                protected Component createNextButton() {
                    return null;
                }

                protected Component createPreviousButton() {
                    return null;
                }
            });
        }
    }
}

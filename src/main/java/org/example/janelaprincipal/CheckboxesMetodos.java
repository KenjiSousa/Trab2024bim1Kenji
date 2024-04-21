package org.example.janelaprincipal;

import javax.swing.*;
import java.awt.*;

public class CheckboxesMetodos extends JPanel {
    private final JCheckBox CHK_INSERCAO;
    private final JCheckBox CHK_SELECAO;
    private final JCheckBox CHK_BOLHA;

    public CheckboxesMetodos() {
        CHK_INSERCAO = new JCheckBox("Inserção", true);
        CHK_SELECAO = new JCheckBox("Seleção", true);
        CHK_BOLHA = new JCheckBox("Bolha", true);

        add(CHK_INSERCAO);
        add(CHK_SELECAO);
        add(CHK_BOLHA);
    }

    public boolean insercao() {
        return CHK_INSERCAO.isSelected();
    }

    public boolean selecao() {
        return CHK_SELECAO.isSelected();
    }

    public boolean bolha() {
        return CHK_BOLHA.isSelected();
    }
}

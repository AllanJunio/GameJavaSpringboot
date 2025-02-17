package com.game.JogoRpg.view;

import javax.swing.*;

public class CriarPersonagem {

    public static int estiloCombate(){
        String [] opcoesCombate = { "Guerreiro", "Mago", "Arqueiro"};
        JComboBox<String> menu = new JComboBox<String>(opcoesCombate);

        JOptionPane.showConfirmDialog(null, menu, "Selecione a opção desejada", JOptionPane.OK_CANCEL_OPTION);
        return menu.getSelectedIndex();
    }
}

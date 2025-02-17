package com.game.JogoRpg.view;
import com.game.JogoRpg.controller.*;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
public class Messages {

    public static int solicitaOpcao() {
        String[] opcoes = { "Atacar inimigo", "Atacar com magia", "Curar a vida" };
        JComboBox<String> menu = new JComboBox<String>(opcoes);

        JOptionPane.showConfirmDialog(null, menu, "Selecione a opção desejada", JOptionPane.OK_CANCEL_OPTION);
        return menu.getSelectedIndex();
    }



}

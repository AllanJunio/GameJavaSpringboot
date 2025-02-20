package com.game.JogoRpg.view;

import javax.swing.*;

public class CriarPersonagem {

    public static String criarPersonagem() {
        // Escolher Estilo de Combate
        String[] opcoesCombate = {"Guerreiro", "Mago", "Arqueiro"};
        JComboBox<String> menuCombate = new JComboBox<>(opcoesCombate);
        JOptionPane.showConfirmDialog(null, menuCombate, "Escolha o estilo de combate", JOptionPane.OK_CANCEL_OPTION);
        String estilo = (String) menuCombate.getSelectedItem();

        // Escolher Raça
        String[] racas = {"Humano", "Elfo", "Anão", "Orc"};
        JComboBox<String> menuRaca = new JComboBox<>(racas);
        JOptionPane.showConfirmDialog(null, menuRaca, "Escolha a raça do personagem", JOptionPane.OK_CANCEL_OPTION);
        String raca = (String) menuRaca.getSelectedItem();

        // Escolher Nome
        String nome = JOptionPane.showInputDialog("Digite o nome do seu personagem:");

        return "Nome: " + nome + "\nRaça: " + raca + "\nEstilo de Combate: " + estilo;
    }
}
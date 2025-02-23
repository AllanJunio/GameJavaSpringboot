package com.game.JogoRpg.controller;
import com.game.JogoRpg.model.*;
import com.game.JogoRpg.view.CriarPersonagem;

import javax.swing.*;

public class CreatePersonagem {
    public void criarPersonagem() {
        CriarPersonagem criarPersonagem = new CriarPersonagem();
        criarPersonagem.criarPersonagem();
        /*if (criarPersonagem.equals("Guerreiro")) {
            JOptionPane.showConfirmDialog(null, "Seu personagem é um guerreiro");
        }else {
            JOptionPane.showConfirmDialog(null, "Seu personagem pertence a outra classe");
        }*/
    }

    int atacar = 0;
    double experienciaPers;

    public double experiencia() {
        for (int i = 0; i < atacar; i++) {
            if (atacar != 0) {

                experienciaPers =+ 0.85;

            }

        }
        return experienciaPers;
    }
}
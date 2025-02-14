package com.game.JogoRpg.controller;
import com.game.JogoRpg.model.*;
import com.game.JogoRpg.view.*;

import javax.swing.*;

public class Acoes {
Messages msg = new Messages();
    public void exibeMenu() {

      /*  int opcao;
        do {
            do {
opcao= msg.solicitaOpcao();
            }while(opcao != 0 && (msg.equals(null))); //revisar a logica
switch (opcao) {
    case 0:
        break;
        case 1:
            break;
            case 2:
                break;
                case 3:
                    break;
}
        }while( opcao != 3 );*/
//exibir mensagem para encerrar o programa

    }
    public void combate(){
        Npc npc = new Npc();
        npc.setForca(50);
        PersonagemPrincipal person = new PersonagemPrincipal();
        person.setForca(30);
 if (npc.getForca()>person.getForca()) {
     JOptionPane.showMessageDialog(null, "Voccê perdeu, o npc é mais forte");
 }else {
 JOptionPane.showMessageDialog(null, "Parebén, você derrotou o npc");
 }
    }
}


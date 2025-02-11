package com.game.JogoRpg.controller;
import com.game.JogoRpg.model.Personagem;
import com.game.JogoRpg.view.*;

import java.awt.*;

public class Acoes {
Messages msg = new Messages();
    public void exibeMenu() {
        int opcao;
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
        }while( opcao != 3 );
//exibir mensagem para encerrar o programa

    }
}


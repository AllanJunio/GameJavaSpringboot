package com.game.JogoRpg.model;
import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private List<Item> itens;

    public Inventario() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(Item item) {
        itens.add(item);
    }

    public void removerItem(Item item) {
        itens.remove(item);
    }

    public void mostrarItens() {
        if (itens.isEmpty()) {
            System.out.println("Inventário vazio.");
        } else {
            for (Item item : itens) {
                System.out.println(item);
            }
        }
    }

    public List<Item> getItens() {
        return itens;
    }
}

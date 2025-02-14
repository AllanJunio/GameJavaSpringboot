package com.game.JogoRpg.model;

public class Personagem {
    private String nome;
    private int level;
    private double forca;
    private double magia;
    private double vida;
    private Inventario inventario; // Novo campo

    public Personagem() {
        this.inventario = new Inventario(); // Inicializa o inventário
    }

    public void equiparItem(Item item) {
        if (item.getType().equals("Arma")) {
            this.forca += item.getPower(); // Aumenta a força se for uma arma
        } else if (item.getType().equals("Poção")) {
            this.vida += item.getPower(); // Recupera vida
        }
        System.out.println(nome + " equipou " + item.getName());
    }

    // Métodos getters e setters aqui...
    public Inventario getInventario() {
        return inventario;
    }

    public String getNome() {
        return nome;
    }

    public int getLevel() {
        return level;
    }

    public double getForca() {
        return forca;
    }

    public double getMagia() {
        return magia;
    }

    public double getVida() {
        return vida;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setForca(double forca) {this.forca = forca;}

    public void setMagia(double magia) {
        this.magia = magia;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }
}

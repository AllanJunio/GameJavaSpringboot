package com.game.JogoRpg.model;

public class Personagem {
    private String nome;
    private int level;
    private double forca;
    private double magia;
    private double vida;

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

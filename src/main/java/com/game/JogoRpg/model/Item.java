package com.game.JogoRpg.model;

public class Item {
    private String name;
    private String  type;
    private int power;


public Item(String name, String type, int power) {
    this.name = name;
    this.type = type;
    this.power = power;
}

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getPower() {
        return power;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return name + " (" + type + ") - Poder: " + power;
    }
}

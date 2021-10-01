package com.company;

public abstract class MagicBeast {
    protected String name;
    protected double mana;

    abstract void say();

    public String getName() {
        return name;
    }

    public double getMana() {
        return mana;
    }

    public void setMana(double mana) {
        this.mana = mana;
    }

    public MagicBeast(String name, double mana) {
        this.name = name;
        this.mana = mana;
    }
}


package com.company;

public class Pegass extends MagicHorse implements DoMagic, Trainee{
    public Pegass(String name, double mana) {
        super(name, mana);
    }

    @Override
    public void minusMana() {
        mana-= 3;
        System.out.println(mana);
    }

    @Override
    void say() {
        System.out.println("I am not a Unicorn!!");
    }

    @Override
    void run() {
        System.out.println("I can fly");
    }

    @Override
    public void train(double coef) {
    mana *= 1.10;
    mana *= coef;
    }
}

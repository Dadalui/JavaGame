package com.company;

public class Unicorn extends MagicHorse implements DoMagic, Trainee{

    public Unicorn(String name, double mana) {
        super(name, mana);
    }

    @Override
    void say() {
        System.out.println("I am Unicorn!!");

    }

    @Override
    void run() {
        System.out.println("I run fast!");

    }

    @Override
    public void minusMana() {
        mana -= 2;
    }

    @Override
    public void train(double coef) {
        mana*= coef;

    }
}

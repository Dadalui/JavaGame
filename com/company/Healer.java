package com.company;

public class Healer extends MagicBeast {
    public Healer(String name, double mana) {
        super(name, mana);
    }

    public void healer( MagicBeast magicBeast){
        magicBeast.setMana(100);
    }
    @Override
    void say() {
        System.out.println("Приветб, я лекарьб");
    }
}

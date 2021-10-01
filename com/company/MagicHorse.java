package com.company;

public abstract class MagicHorse extends MagicBeast{

    public MagicHorse(String name, double mana) {
        super(name, mana);
    }
    abstract void run();
}

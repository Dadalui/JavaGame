package com.company;

public class Main {

    public static void main(String[] args) {
        Unicorn unicorn = new Unicorn("George", 99.7);
        unicorn.say();
        unicorn.run();
        Pegass pegass = new Pegass("Misha", 85.4);
        pegass.run();
        pegass.say();
        Healer healer = new Healer("Dmitry", 1000);
        BattleField.battle(pegass, unicorn);
        healer.healer(pegass);
    }
}

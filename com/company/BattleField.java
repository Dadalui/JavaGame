package com.company;

public class BattleField {
    public static void battle(MagicBeast one, MagicBeast two) {
        if (one.getMana() > two.getMana()) {
            two.setMana(0);
        }
        if (one.getMana() < two.getMana()) {
            one.setMana(0);
        } else {
            System.out.println(" Ничья ");
        }

    }

}

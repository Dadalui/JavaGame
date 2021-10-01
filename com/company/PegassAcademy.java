package com.company;

public class PegassAcademy extends Academy {

    public PegassAcademy(double coef) {
        super(coef);
    }

    @Override
    public void teach(Trainee trainee) {
        if ( trainee instanceof Pegass){
            trainee.train(coef);
        }
    }
}

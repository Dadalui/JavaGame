package com.company;

public abstract class Academy {
    protected final double coef;

    public abstract void teach (Trainee trainee);

    public Academy(double coef) {
        this.coef = coef;
    }
}

package com.company;

public class UnicornAcademy extends Academy{


    @Override
    public void teach(Trainee trainee) {
      if ( trainee instanceof Unicorn){
          trainee.train(coef);
      }
    }

    public UnicornAcademy(double coef) {
        super(coef);
    }
}

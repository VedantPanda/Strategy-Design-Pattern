package main.DuckType;

import main.Behaviours.Quack.impl.MuteQuack;
import main.Duck;
import main.Behaviours.Fly.impl.FlyWithWings;

public class DecoyDuck extends Duck {

    @Override
    public void display() {
        System.out.println("I am Decoy Duck");
    }

    public DecoyDuck() {
        super(new FlyWithWings(), new MuteQuack());
    }
}

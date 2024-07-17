package main.DuckType;

import main.Behaviours.Fly.impl.FlyWithWings;
import main.Behaviours.Quack.impl.MuteQuack;
import main.Duck;

public class RedHeadDuck extends Duck {

    @Override
    public void display() {
        System.out.println("I am Red Head Duck");
    }

    public RedHeadDuck(){
        super(new FlyWithWings(), new MuteQuack());
    }

}

package main.DuckType;

import main.Duck;
import main.Behaviours.Fly.impl.FlyWithWings;
import main.Behaviours.Quack.impl.Quack;

public class MallardDuck extends Duck {
    @Override
    public void display() {
        System.out.println("I am Mallard Duck");
    }

    public MallardDuck(){
        super(new FlyWithWings(), new Quack());
    }
}

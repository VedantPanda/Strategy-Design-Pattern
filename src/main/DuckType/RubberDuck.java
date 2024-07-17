package main.DuckType;

import main.Behaviours.Fly.impl.FlyNoWay;
import main.Behaviours.Quack.impl.Quack;
import main.Duck;

public class RubberDuck extends Duck {

    @Override
    public void display() {
        System.out.println("I am Rubber Duck");
    }

    public RubberDuck(){
        super(new FlyNoWay(), new Quack());
    }

}

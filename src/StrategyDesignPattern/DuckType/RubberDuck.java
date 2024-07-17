package StrategyDesignPattern.DuckType;

import StrategyDesignPattern.Behaviours.Fly.impl.FlyNoWay;
import StrategyDesignPattern.Behaviours.Quack.impl.Quack;
import StrategyDesignPattern.Duck;

public class RubberDuck extends Duck {

    @Override
    public void display() {
        System.out.println("I am Rubber Duck");
    }

    public RubberDuck(){
        super(new FlyNoWay(), new Quack());
    }

}

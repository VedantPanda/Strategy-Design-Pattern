package StrategyDesignPattern.DuckType;

import StrategyDesignPattern.Duck;
import StrategyDesignPattern.Behaviours.Fly.impl.FlyWithWings;
import StrategyDesignPattern.Behaviours.Quack.impl.Quack;

public class MallardDuck extends Duck {
    @Override
    public void display() {
        System.out.println("I am Mallard Duck");
    }

    public MallardDuck(){
        super(new FlyWithWings(), new Quack());
    }
}

package StrategyDesignPattern.DuckType;

import StrategyDesignPattern.Behaviours.Fly.impl.FlyWithWings;
import StrategyDesignPattern.Behaviours.Quack.impl.MuteQuack;
import StrategyDesignPattern.Duck;

public class RedHeadDuck extends Duck {

    @Override
    public void display() {
        System.out.println("I am Red Head Duck");
    }

    public RedHeadDuck(){
        super(new FlyWithWings(), new MuteQuack());
    }

}

package StrategyDesignPattern.DuckType;

import StrategyDesignPattern.Behaviours.Quack.impl.MuteQuack;
import StrategyDesignPattern.Duck;
import StrategyDesignPattern.Behaviours.Fly.impl.FlyWithWings;

public class DecoyDuck extends Duck {

    @Override
    public void display() {
        System.out.println("I am Decoy Duck");
    }

    public DecoyDuck() {
        super(new FlyWithWings(), new MuteQuack());
    }
}

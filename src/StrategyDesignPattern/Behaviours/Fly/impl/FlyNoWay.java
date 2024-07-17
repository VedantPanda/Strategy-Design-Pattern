package StrategyDesignPattern.Behaviours.Fly.impl;

import StrategyDesignPattern.Behaviours.Fly.Flying;

public class FlyNoWay implements Flying {
    @Override
    public void fly() {
        System.out.println("I Do Not Fly");
    }
}

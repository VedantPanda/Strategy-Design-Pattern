package StrategyDesignPattern.Behaviours.Fly.impl;

import StrategyDesignPattern.Behaviours.Fly.Flying;

public class FlyWithWings implements Flying {
    @Override
    public void fly() {
        System.out.println("I fly with my wings");
    }
}

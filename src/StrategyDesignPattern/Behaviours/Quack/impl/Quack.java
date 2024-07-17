package StrategyDesignPattern.Behaviours.Quack.impl;

import StrategyDesignPattern.Behaviours.Quack.Quacking;

public class Quack implements Quacking {
    @Override
    public void quack() {
        System.out.println("I am Quacking");
    }
}

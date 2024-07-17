package StrategyDesignPattern.Behaviours.Quack.impl;

import StrategyDesignPattern.Behaviours.Quack.Quacking;

public class MuteQuack implements Quacking {
    @Override
    public void quack() {
        System.out.println("I do not quack");
    }
}

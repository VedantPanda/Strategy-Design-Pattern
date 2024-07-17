package main.Behaviours.Quack.impl;

import main.Behaviours.Quack.Quacking;

public class MuteQuack implements Quacking {
    @Override
    public void quack() {
        System.out.println("I do not quack");
    }
}

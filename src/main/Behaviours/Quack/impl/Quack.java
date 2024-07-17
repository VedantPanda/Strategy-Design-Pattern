package main.Behaviours.Quack.impl;

import main.Behaviours.Quack.Quacking;

public class Quack implements Quacking {
    @Override
    public void quack() {
        System.out.println("I am Quacking");
    }
}

package main.Behaviours.Fly.impl;

import main.Behaviours.Fly.Flying;

public class FlyNoWay implements Flying {
    @Override
    public void fly() {
        System.out.println("I Do Not Fly");
    }
}

package main.Behaviours.Fly.impl;

import main.Behaviours.Fly.Flying;

public class FlyWithWings implements Flying {
    @Override
    public void fly() {
        System.out.println("I fly with my wings");
    }
}

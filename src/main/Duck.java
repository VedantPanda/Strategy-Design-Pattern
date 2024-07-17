package main;

import main.Behaviours.Fly.Flying;
import main.Behaviours.Quack.Quacking;

public abstract class Duck {

    private Flying flyBehaviour;

    private Quacking quackBehaviour;

    public abstract void display();

    public Duck(Flying flyBehaviour){
        this.flyBehaviour = flyBehaviour;
    }

    public Duck(Flying flyBehaviour, Quacking quackBehaviour){
        this.flyBehaviour = flyBehaviour;
        this.quackBehaviour = quackBehaviour;
    }

    public Duck(){
    }

    public Duck(Quacking quackBehaviour){
        this.quackBehaviour = quackBehaviour;
    }

    public void swim(){
        System.out.println("Swimming");
    }

    public void performFly(){
        flyBehaviour.fly();
    }

    public void performQuack(){
        quackBehaviour.quack();
    }

}

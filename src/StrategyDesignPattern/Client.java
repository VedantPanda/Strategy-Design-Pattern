package StrategyDesignPattern;

import StrategyDesignPattern.DuckType.MallardDuck;

public class Client {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.display();
        duck.performFly();
        duck.performQuack();
    }
}
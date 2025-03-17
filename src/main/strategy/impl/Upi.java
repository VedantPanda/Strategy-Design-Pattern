package main.strategy.impl;

import main.strategy.PaymentStrategy;

public class Upi implements PaymentStrategy {
    @Override
    public void processPayment() {
        System.out.println("Upi processing");
    }
}

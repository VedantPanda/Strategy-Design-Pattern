package main.strategy.impl;

import main.strategy.PaymentStrategy;

public class CreditCard implements PaymentStrategy {
    @Override
    public void processPayment() {
        System.out.println("Credit card processing");
    }
}

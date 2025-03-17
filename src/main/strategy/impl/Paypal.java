package main.strategy.impl;

import main.strategy.PaymentStrategy;

public class Paypal implements PaymentStrategy {
    @Override
    public void processPayment() {
        System.out.println("PayPal processing");
    }
}

package main;

import main.strategy.impl.CreditCard;
import main.strategy.impl.Paypal;
import main.strategy.impl.Upi;

public class Client {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor(new CreditCard());
        paymentProcessor.processPayment();
        paymentProcessor.setPaymentStrategy(new Upi());
        paymentProcessor.processPayment();
        paymentProcessor.setPaymentStrategy(new Paypal());
        paymentProcessor.processPayment();
    }
}

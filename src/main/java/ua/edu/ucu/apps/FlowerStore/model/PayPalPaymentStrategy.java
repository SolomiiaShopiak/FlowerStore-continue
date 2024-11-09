package ua.edu.ucu.apps.FlowerStore.model;

public class PayPalPaymentStrategy implements Payment{
    private String email;

    public PayPalPaymentStrategy(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using PayPal.");
    }
}

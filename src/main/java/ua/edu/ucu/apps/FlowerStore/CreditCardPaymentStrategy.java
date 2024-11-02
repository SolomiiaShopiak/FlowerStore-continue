package ua.edu.ucu.apps.FlowerStore;

public class CreditCardPaymentStrategy implements Payment{
    private String cardNumber;
    private String cardHolderName;

    public CreditCardPaymentStrategy(String cardNumber, String cardHolderName) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using Credit Card.");
    }
}

package ua.edu.ucu.apps.FlowerStore;

import java.util.List;

public class Order {
    private List<Item> items;
    private String clientName;
    private Payment payment;
    private Delivery delivery;

    public Order(List<Item> items, String clientName) {
        this.items = items;
        this.clientName = clientName;
    }

    public double calculateTotalPrice() {
        return items.stream().mapToDouble(Item::getTotalPrice).sum();
    }

    public void setPaymentStrategy(Payment paymentStrategy) {
        this.payment = paymentStrategy;
    }

    public void setDeliveryStartegy(Delivery deliveryStrategy) {
        this.delivery = deliveryStrategy;
    }

    public void processOrder() {
        if (payment == null) {
            System.out.println("Payment strategy not set. Cannot process the order.");
            return;
        }
        double amount = calculateTotalPrice();
        payment.pay(amount);
        System.out.println("Order processed for client: " + clientName);
    }

    public void deliverOrder() {
        if (delivery == null) {
            System.out.println("Delivery strategy not set. Cannot deliver the order.");
            return;
        }
        delivery.deliver(items);
    }

    @Override
    public String toString() {
        return "Order{" +
                "items=" + items +
                ", clientName='" + clientName + '\'' +
                '}';
    }
}
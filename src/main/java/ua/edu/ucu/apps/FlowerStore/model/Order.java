package ua.edu.ucu.apps.FlowerStore.model;

import java.util.List;
import java.util.LinkedList;

public class Order {
    private List<User> users = new LinkedList<>();
    private List<Item> items;
    private Payment payment;
    private Delivery delivery;

    public Order() {
        this.items = new LinkedList<>();
    }

    public void setPaymentStrategy(Payment payment) {
        this.payment = payment;
    }

    public void setDeliveryStrategy(Delivery delivery) {
        this.delivery = delivery;
    }

    public double calculateTotalPrice() {
        double total = 0;
        for (Item item : items) {
            total += item.price();
        }
        return total;
    }

    public void processOrder() {
        if (payment != null && delivery != null) {
            double totalPrice = calculateTotalPrice();
            payment.pay(totalPrice);
            delivery.deliver(items);
        } else {
            System.out.println("Payment and/or Delivery strategy is not set.");
        }
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void removeUser(User user) {
        users.remove(user);
    }

    public void notifyUsers() {
        for (User user : users) {
            user.update("Order status updated.");
        }
    }

    public void order() {
        notifyUsers();
    }
}
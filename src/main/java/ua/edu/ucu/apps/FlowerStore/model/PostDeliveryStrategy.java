package ua.edu.ucu.apps.FlowerStore.model;

import java.util.List;

public class PostDeliveryStrategy implements Delivery{
    @Override
    public void deliver(List<Item> items) {
        System.out.println("Delivering via Post Service:");
        items.forEach(item -> System.out.println(" - " + item));
        System.out.println("The items have been sent via postal service.");
    }
}

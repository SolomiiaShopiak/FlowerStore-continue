package ua.edu.ucu.apps.FlowerStore;

import java.util.List;

public class DHLDeliveryStrategy implements Delivery{
    @Override
    public void deliver(List<Item> items) {
        System.out.println("Delivering via DHL:");
        items.forEach(item -> System.out.println(" - " + item));
        System.out.println("The items have been dispatched using DHL.");
    }
}

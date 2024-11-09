package ua.edu.ucu.apps.FlowerStore.model;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket extends Item {
    private List<Flower> flowers;

    public FlowerBucket(String description) {
        super(description);
        this.flowers = new ArrayList<>();
    }

    public void addFlowers(List<Flower> flowersList) {
        flowers.addAll(flowersList);
    }

    @Override
    public double price() {
        double totalPrice = 0;
        for (Flower flower : flowers) {
            totalPrice += flower.price();
        }
        return totalPrice;
    }

    public List<Flower> searchFlower(String description) {
        List<Flower> foundFlowers = new ArrayList<>();
        for (Flower flower : flowers) {
            if (flower.getDescription().equalsIgnoreCase(description)) {
                foundFlowers.add(flower);
            }
        }
        return foundFlowers;
    }
}

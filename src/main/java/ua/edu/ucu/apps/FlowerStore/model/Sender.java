package ua.edu.ucu.apps.FlowerStore.model;

public class Sender implements User {
    @Override
    public void update(String status) {
        System.out.println("Sender updated with status: " + status);
    }
}

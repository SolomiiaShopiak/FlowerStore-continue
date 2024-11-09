package ua.edu.ucu.apps.FlowerStore.model;

public class Receiver implements User {
    @Override
    public void update(String status) {
        System.out.println("Receiver updated with status: " + status);
    }
}

package ua.edu.ucu.apps.FlowerStore.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "flowers")
public class Flower extends Item{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String color;
    private Double price;
    private boolean available;

    public Flower(String description, String name, String color, double price, boolean available) {
        super(description);
        this.name = name;
        this.color = color;
        this.price = price;
        this.available = available;
    }

    @Override
    public double price() {
        return price;
    }
}
package ua.edu.ucu.apps.FlowerStore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Flower {
    @Getter
    private double sepalLength;
    private FlowerColor color;
    @Getter
    private double price;
    @Getter
    private FlowerType flowerType;

    public Flower(Flower flower) {
        this.color = flower.color;
        this.flowerType = flower.flowerType;
        this.price = flower.price;
        this.sepalLength = flower.sepalLength;
    }

    public Flower(FlowerColor color, FlowerType flowerType, double price, double sepalLength) {
        this.color = color;
        this.flowerType = flowerType;
        this.price = price;
        this.sepalLength = sepalLength;
    }

    public String getColor() {
        return color.toString();
    }
}

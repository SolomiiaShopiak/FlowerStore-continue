package ua.edu.ucu.apps.FlowerStore.model;

public class BasketDecorator extends AbstractDecorator {
    public BasketDecorator(Item item) {
        super(item);
    }

    @Override
    public String getDescription() {
        return item.getDescription() + ", placed in a basket";
    }

    @Override
    public double price() {
        return item.price() + 4;
    }
}

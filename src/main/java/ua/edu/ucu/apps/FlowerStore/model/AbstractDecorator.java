package ua.edu.ucu.apps.FlowerStore.model;

public abstract class AbstractDecorator extends Item {
    protected Item item;

    public AbstractDecorator(Item item) {
        super(item.getDescription());
        this.item = item;
    }

    @Override
    public abstract String getDescription();

    @Override
    public abstract double price();
}

package ua.edu.ucu.apps.FlowerStore.model;

public class RibbonDecorator extends AbstractDecorator {
    public RibbonDecorator(Item item) {
        super(item);
    }

    @Override
    public String getDescription() {
        return item.getDescription() + ", tied with a ribbon";
    }

    @Override
    public double price() {
        return item.price() + 40;
    }
}

package ua.edu.ucu.apps.FlowerStore.model;

public class PaperDecorator extends AbstractDecorator {
    public PaperDecorator(Item item) {
        super(item);
    }

    @Override
    public String getDescription() {
        return item.getDescription() + ", wrapped in paper";
    }

    @Override
    public double price() {
        return item.price() + 13;
    }
}

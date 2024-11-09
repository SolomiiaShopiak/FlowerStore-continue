package ua.edu.ucu.apps.FlowerStore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.edu.ucu.apps.FlowerStore.model.Flower;
import ua.edu.ucu.apps.FlowerStore.model.FlowerBucket;
import ua.edu.ucu.apps.FlowerStore.model.Item;
import ua.edu.ucu.apps.FlowerStore.model.PaperDecorator;
import ua.edu.ucu.apps.FlowerStore.model.RibbonDecorator;
import ua.edu.ucu.apps.FlowerStore.model.BasketDecorator;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

class DecoratorTest {

    private FlowerBucket flowerBucket;

    @BeforeEach
    void setup() {
        flowerBucket = new FlowerBucket("Mixed flower bucket");
        List<Flower> flowers = List.of(
            new Flower("Beautiful rose", "Rose", "Red", 10.0, true),
            new Flower("Lovely Lily", "Lily", "White", 12.0, true),
            new Flower("Daisy Delight", "Daisy", "Pink", 6.0, true)
        );
        flowerBucket.addFlowers(flowers);
    }

    @Test
    void testPaperDecorator() {
        Item paperDecoratedBucket = new PaperDecorator(flowerBucket);
        
        assertEquals("Mixed flower bucket, wrapped in paper", paperDecoratedBucket.getDescription());
        assertEquals(41.0, paperDecoratedBucket.price());
    }

    @Test
    void testRibbonDecorator() {
        Item ribbonDecoratedBucket = new RibbonDecorator(flowerBucket);
        
        assertEquals("Mixed flower bucket, tied with a ribbon", ribbonDecoratedBucket.getDescription());
        assertEquals(68.0, ribbonDecoratedBucket.price());
    }

    @Test
    void testBasketDecorator() {
        Item basketDecoratedBucket = new BasketDecorator(flowerBucket);
        
        assertEquals("Mixed flower bucket, placed in a basket", basketDecoratedBucket.getDescription());
        assertEquals(32.0, basketDecoratedBucket.price());
    }

    @Test
    void testMultipleDecorators() {
        Item decoratedBucket = new RibbonDecorator(new PaperDecorator(new BasketDecorator(flowerBucket)));
        
        assertEquals("Mixed flower bucket, placed in a basket, wrapped in paper, tied with a ribbon", decoratedBucket.getDescription());
        assertEquals(85.0, decoratedBucket.price());
    }
}

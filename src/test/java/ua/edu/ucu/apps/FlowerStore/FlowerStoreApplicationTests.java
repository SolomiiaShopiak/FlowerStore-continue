package ua.edu.ucu.apps.FlowerStore;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FlowerStoreApplicationTests {

	@Test
    void testPostDelivery() {
        PostDeliveryStrategy postDelivery = new PostDeliveryStrategy();
        List<Item> items = List.of(new Item("Rose", 2, 5.0), new Item("Lily", 1, 7.5));
        postDelivery.deliver(items);
        assertEquals(2, items.size());
    }

	@Test
    void testDHLDelivery() {
        DHLDeliveryStrategy dhlDelivery = new DHLDeliveryStrategy();
        List<Item> items = List.of(new Item("Tulip", 3, 3.0), new Item("Orchid", 1, 15.0));
        dhlDelivery.deliver(items);
        assertEquals(2, items.size());
    }

	@Test
    void testCreditCardPayment() {
        CreditCardPaymentStrategy creditCardPayment = new CreditCardPaymentStrategy("1234-5678-9012-3456", "John Doe");
        double amount = 100.0;
        creditCardPayment.pay(amount);
        assertEquals(100.0, amount);
    }

	@Test
    void testPayPalPayment() {
        PayPalPaymentStrategy payPalPayment = new PayPalPaymentStrategy("test@example.com");
        double amount = 50.0;
        payPalPayment.pay(amount);
        assertEquals(50.0, amount);
    }
}

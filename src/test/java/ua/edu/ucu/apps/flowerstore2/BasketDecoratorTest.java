package ua.edu.ucu.apps.flowerstore2;

import org.junit.jupiter.api.Test;
import ua.edu.ucu.apps.flowerstore.flowers.Item;
import ua.edu.ucu.apps.flowerstore.decorator.BasketDecorator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasketDecoratorTest {

    @Test
    public void testBasketDecoratorPrice() {
        // Create a mock item with a known price
        MockItem mockItem = new MockItem(10.0);

        // Create a BasketDecorator for the mock item
        BasketDecorator basketDecorator = new BasketDecorator(mockItem);

        // Check if the total price is the sum of the item's price and the decorPrice
        double expectedPrice = 10.0 + basketDecorator.price();
        assertEquals(expectedPrice, basketDecorator.price(), 0.001);
    }

    // MockItem class for testing purposes
    private static class MockItem {

        private double price;

        public MockItem(double price) {
            this.price = price;
        }

        public double price() {
            return price;
        }

        public double getDescription() {
            return 0;
        }
    }
}

package ua.edu.ucu.apps.flowerstore2;

import org.junit.jupiter.api.Test;
import ua.edu.ucu.apps.flowerstore.decorator.BasketDecorator;
import ua.edu.ucu.apps.flowerstore.decorator.PricedItem;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasketDecoratorTest {

    @Test
    public void testBasketDecoratorPrice() {
        // Create a mock item with a known price
        PricedItem mockItem = () -> 10.0;

        // Create a BasketDecorator for the mock item
        BasketDecorator basketDecorator = new BasketDecorator(mockItem);

        // Check if the total price is the sum of the item's price and the decorPrice
        double expectedPrice = 14;
        assertEquals(expectedPrice, basketDecorator.price(), 0.001);
    }
}

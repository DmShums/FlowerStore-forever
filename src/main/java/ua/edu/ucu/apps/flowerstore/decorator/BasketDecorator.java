package ua.edu.ucu.apps.flowerstore.decorator;
import ua.edu.ucu.apps.flowerstore.flowers.Item;

public class BasketDecorator extends ItemDecorator{
    private final int decorPrice = 4;
    private Item item;
    @Override
    public double price() {
        return item.price() + decorPrice;
    }

    @Override
    public double getDescription() {
        return 0;
    }
}

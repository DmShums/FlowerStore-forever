package ua.edu.ucu.apps.flowerstore.decorator;
import ua.edu.ucu.apps.flowerstore.flowers.Item;

public class PaperDecorator extends ItemDecorator{
    private final int decorPrice = 13;
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

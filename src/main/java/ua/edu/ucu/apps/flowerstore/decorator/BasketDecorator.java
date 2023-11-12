package ua.edu.ucu.apps.flowerstore.decorator;

public class BasketDecorator extends ItemDecorator {
    private final int decorPrice = 4;
    private PricedItem item;

    public BasketDecorator(PricedItem item) {
        this.item = item;
    }

    @Override
    public double price() {
        return item.price() + decorPrice;
    }

    @Override
    public double getDescription() {
        return 0;
    }
}

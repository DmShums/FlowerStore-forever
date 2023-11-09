package ua.edu.ucu.apps.flowerstore.decorator;

import ua.edu.ucu.apps.flowerstore.flowers.Item;

public abstract class ItemDecorator extends Item {
    private int decoratorPrice;
    private String description;
    public abstract double price();
    public abstract double getDescription();
}

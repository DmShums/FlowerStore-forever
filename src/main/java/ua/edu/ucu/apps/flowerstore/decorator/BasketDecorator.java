//package ua.edu.ucu.apps.flowerstore.decorator;
//import ua.edu.ucu.apps.flowerstore.flowers.Item;
//
//public class BasketDecorator extends ItemDecorator{
//    private final int decorPrice = 4;
//    private Item item;
//    @Override
//    public double price() {
//        return item.price() + decorPrice;
//    }
//
//    @Override
//    public double getDescription() {
//        return 0;
//    }
//}
package ua.edu.ucu.apps.flowerstore.decorator;
import ua.edu.ucu.apps.flowerstore.flowers.Item;

public class BasketDecorator extends ItemDecorator {
    private final int decorPrice = 4;
    private Object item;  // Change the type to Object

    // Updated constructor to accept any object with a 'price()' method
    public BasketDecorator(Object item) {
        this.item = item;
    }

    @Override
    public double price() {
        // Check if the item has a 'price()' method
        if (item instanceof Item) {
            return ((Item) item).price() + decorPrice;
        } else {
            throw new UnsupportedOperationException("Item must have a 'price()' method");
        }
    }

    @Override
    public double getDescription() {
        return 0;
    }
}

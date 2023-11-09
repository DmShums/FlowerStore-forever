package ua.edu.ucu.apps.flowerstore.order;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import ua.edu.ucu.apps.flowerstore.flowers.Item;
import ua.edu.ucu.apps.flowerstore.delivery.Delivery;
import ua.edu.ucu.apps.flowerstore.payment.Payment;

@AllArgsConstructor
public class Order {
    private List<Item> items;
    private Payment payment;
    private Delivery delivery;
    @Getter
    private double price;

    public void setDeliveryStrategy(Delivery deliveryMeth) {
        this.delivery = deliveryMeth;
    }
    public void setPaymentStrategy(Payment paymentMeth) {
        this.payment = paymentMeth;
    }

    void calculateTotalPrice() {
        double sum = 0;
        for (Item item : items) {
            sum += item.price();
        }
        this.price = sum;
    }

    void addItem(Item item) {
        items.add(item);
        calculateTotalPrice();
    }

    void removeItem(Item item) {
        items.remove(item);
        calculateTotalPrice();
    }

    void processOrder() {
        System.out.printf("items: " + items.size());
        System.out.printf("strategy: "+ payment.getClass().getSimpleName());
        System.out.printf("price: " + price);
    }
}

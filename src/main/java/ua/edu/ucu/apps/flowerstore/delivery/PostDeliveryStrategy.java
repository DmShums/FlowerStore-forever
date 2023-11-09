package ua.edu.ucu.apps.flowerstore.delivery;

import java.util.List;

public class PostDeliveryStrategy extends Delivery{
    @Override
    public String deliver(List<String> items) {
        return items.toString();
    }
}

package ua.edu.ucu.apps.flowerstore.flowers;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket extends Item{
    private final List<Flower> flowers= new ArrayList<>();

    @Override
    public double price() {
        int sum = 0;
        for (Flower flower : flowers) {
            sum += flower.price();
        }
        return sum;
    }

    public Flower searchFlower(Flower flower) {
        for (Flower flwr : flowers) {
            if (flwr.getPrice() == flower.getPrice()) {
                return flwr;
            }
        }
        return flower;
    }

    public void addFlowers(Flower flwr) {
        flowers.add(flwr);
    }

    @Override
    public double getDescription() {
        return 0;
    }
}

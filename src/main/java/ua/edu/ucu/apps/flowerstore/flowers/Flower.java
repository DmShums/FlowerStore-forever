package ua.edu.ucu.apps.flowerstore.flowers;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor @Getter @NoArgsConstructor @ToString
// @Entity
public class Flower extends Item {
    @Setter
    private double price;
    private double sepalLength;
    @Setter
    private FlowerColor color;
    private FlowerType flowerType;

    public Flower(Flower flower) {
        this.price = flower.price;
        this.sepalLength = flower.sepalLength;
        this.color = flower.color;
        this.flowerType = flower.flowerType;
    }
}

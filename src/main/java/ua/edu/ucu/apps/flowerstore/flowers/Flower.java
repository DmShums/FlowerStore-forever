package ua.edu.ucu.apps.flowerstore.flowers;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@AllArgsConstructor @Getter @NoArgsConstructor @ToString
@Entity
public class Flower extends Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Setter
    private String description;
    @Getter
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

    @Override
    public double price() {
        return this.price;
    }

    @Override
    public double getDescription() {
        return 0;
    }
}

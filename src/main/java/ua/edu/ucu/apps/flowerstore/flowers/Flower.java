package ua.edu.ucu.apps.flowerstore.flowers;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor @Getter @NoArgsConstructor @ToString
@Entity
@Table
public class Flower extends Item {
    @Id
    @SequenceGenerator(
            name = "flower_sequence",
            sequenceName = "flower_sequence",
            allocationSize = 1
    )
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "flower_sequence"
    )
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

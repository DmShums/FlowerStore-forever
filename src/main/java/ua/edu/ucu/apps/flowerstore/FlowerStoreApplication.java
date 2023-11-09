package ua.edu.ucu.apps.flowerstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.edu.ucu.apps.flowerstore.flowers.Flower;
import ua.edu.ucu.apps.flowerstore.flowers.FlowerColor;
import ua.edu.ucu.apps.flowerstore.flowers.FlowerType;

@RestController
@SpringBootApplication
public class FlowerStoreApplication {
    public static void main(String[] args) {
        SpringApplication.run(FlowerStoreApplication.class, args);
    }
}

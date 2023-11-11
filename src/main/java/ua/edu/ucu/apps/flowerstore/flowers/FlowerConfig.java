package ua.edu.ucu.apps.flowerstore.flowers;

import java.util.List;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FlowerConfig {
    @Bean
    CommandLineRunner commandlineRunner(FlowerRepository repository) {
        return args -> {
            Flower one = new Flower(1L,
                    "fw1",
                    20.0,
                    5.0,
                    FlowerColor.RED,
                    FlowerType.ROSE
            );
            Flower two = new Flower(2L,
                    "fw2",
                    20.0,
                    5.0,
                    FlowerColor.RED,
                    FlowerType.ROSE
            );
            Flower three = new Flower(3L,
                    "fw3",
                    20.0,
                    5.0,
                    FlowerColor.RED,
                    FlowerType.ROSE
            );
            repository.saveAll(
                    List.of(one, two, three)
            );
        };
    }
}

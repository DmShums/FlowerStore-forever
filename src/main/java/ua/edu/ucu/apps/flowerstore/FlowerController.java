package ua.edu.ucu.apps.flowerstore;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.edu.ucu.apps.flowerstore.flowers.Flower;
import ua.edu.ucu.apps.flowerstore.flowers.FlowerColor;
import ua.edu.ucu.apps.flowerstore.flowers.FlowerType;

import java.util.List;

@RestController
@RequestMapping("/api/flower")
public class FlowerController {
    @GetMapping("/list/")
    public List<Flower> hello() {
        return List.of(new Flower(45, 5, FlowerColor.RED, FlowerType.ROSE));
    }
}

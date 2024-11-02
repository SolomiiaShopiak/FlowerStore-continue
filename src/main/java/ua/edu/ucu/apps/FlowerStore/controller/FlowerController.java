package ua.edu.ucu.apps.FlowerStore.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.edu.ucu.apps.FlowerStore.Flower;
import ua.edu.ucu.apps.FlowerStore.FlowerColor;
import ua.edu.ucu.apps.FlowerStore.FlowerType;

@RestController
@RequestMapping("/api/flowers")
public class FlowerController {
    @GetMapping
    public List<Flower> getFlowers() {
        return List.of(
            new Flower(FlowerColor.RED, FlowerType.ROSE, 10.0, 4.5),
            new Flower(FlowerColor.WHITE, FlowerType.LILY, 12.0, 5.0),
            new Flower(FlowerColor.YELLOW, FlowerType.TULIP, 8.0, 3.8)
        );
    }
}

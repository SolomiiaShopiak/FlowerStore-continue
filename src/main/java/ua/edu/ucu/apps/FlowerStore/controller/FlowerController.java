package ua.edu.ucu.apps.FlowerStore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.edu.ucu.apps.FlowerStore.model.Flower;
import ua.edu.ucu.apps.FlowerStore.service.FlowerService;

@RestController
@RequestMapping("/api")
public class FlowerController {
    private FlowerService flowerService;

    @Autowired
    public FlowerController(FlowerService flowerService) {
        this.flowerService = flowerService;
    }

    @GetMapping("/flowers")
    public List<Flower> getFlowers() {
        return flowerService.getFlowers();
    }

    @PostMapping("/flowers")
    public Flower addFlower(@RequestBody Flower flower) {
        return flowerService.addFlower(flower);
    }
}

package ua.edu.ucu.apps.FlowerStore.model;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class FlowerStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlowerStoreApplication.class, args);
	}

	// @Bean
    // CommandLineRunner loadData(FlowerService flowerService) {
    //     return args -> {
    //         flowerService.createFlower(new Flower("Rose", "Red", 5.99, true));
	// 		flowerService.createFlower(new Flower("Tulip", "Yellow", 3.99, true));
	// 		flowerService.createFlower(new Flower("Lily", "Pink", 6.99, false));
    //     };
    // }
}

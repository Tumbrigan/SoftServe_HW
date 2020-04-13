package homeWork09;

import java.util.Arrays;
import java.util.Objects;
import static homeWork09.Plant.createPlant;

public class Bouquet {
    public static void main(String[] args) {
//        List<Plant> plants = new ArrayList<>();
//        Plant pinkRoses = createPlant(10, "pink", "roses");
//        Plant greenCalla = createPlant(15, "calla_lilies", "green");
//        Plant blackMaquis = createPlant(20, "maquis", "black");
//        Plant yellowDaffodils = createPlant(17, "daffodils", "yellow");
//        Plant greenChamomile = createPlant(19, "chamomile", "green");

        Plant[] plants = {
                createPlant(10, "roses", "pink"),
                createPlant(15, "calla_lilies", "white"),
                createPlant(20, "maquis", "black"),
                createPlant(17, "daffodils", "yellow"),
                createPlant(19, "chamomile", "green")};

        System.out.println("My bouquet:");
        Plant.printBouquet(plants);
    }
}

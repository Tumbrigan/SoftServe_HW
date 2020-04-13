package homeWork09;

import static homeWork09.Plant.createPlant;

public class Bouquet {
    public static void main(String[] args) {
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

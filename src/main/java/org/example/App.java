package org.example;
import enums.SportType;
import models.TransportCompetitions;
import models.GamesWithBall;
import models.WaterSport;
import manager.WaterSportManager;

import java.util.List;


public class App {
    public static void main(final String[] args) {
        List<WaterSport> allObjects = List.of(
                new TransportCompetitions("yamaha12", 4, 44, SportType.TRANSPORTTYPE,
                        "Diesel", 10),
                new GamesWithBall("volleyball", 3, 4, SportType.PHYSICALGAME,
                        "light", "green"),
                new TransportCompetitions("yamaha33", 5, 56, SportType.TRANSPORTTYPE,
                        "gas", 122)
        );

        WaterSportManager waterSportManager = new WaterSportManager(allObjects);

        System.out.println("Checking for enough amount of players");
        WaterSportManager.printSortedObjects(waterSportManager.checkForEnoughAmount(5));
        System.out.println("--------------------------------------------");

        System.out.println("Sorting by name\n");
        WaterSportManager.printSortedObjects(waterSportManager.sortByName(true));
        System.out.println("--------------------------------------------");

        System.out.println("Sorting by price");
        WaterSportManager.printSortedObjects(waterSportManager.sortByPrice(true));
        System.out.println("--------------------------------------------");

    }
}

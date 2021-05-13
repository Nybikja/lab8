package manager;
import lombok.AllArgsConstructor;
import models.WaterSport;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
public class WaterSportManager {
    private final List<WaterSport> allObjects;

    public List<WaterSport> sortByName(boolean sortOrder) {
        List<WaterSport> allObjectsSorted = new ArrayList<>(allObjects);
        if (sortOrder) {
            allObjectsSorted.sort(Comparator.comparing(WaterSport::getName));
        } else {
            allObjectsSorted.sort((object1, object2) -> object2.getName().compareTo(object1.getName()));
        }
        return allObjectsSorted;
    }

    public List<WaterSport> sortByPrice(boolean sortOrder) {
        List<WaterSport> allObjectsSorted = new ArrayList<>(allObjects);
        if (sortOrder) {
            allObjectsSorted.sort(Comparator.comparing(WaterSport::getPrice));
        } else {
            allObjectsSorted.sort(Comparator.comparing(WaterSport::getPrice).reversed());
        }
        return allObjectsSorted;
    }

    public List<WaterSport> checkForEnoughAmount(int amount) {
        return allObjects.stream().filter(object -> object.getAmountOfPlayers() >= amount).collect(Collectors.toList());
    }

    public static void printSortedObjects(List<WaterSport> allObjects) {
        allObjects.forEach(System.out::println);
    }
}

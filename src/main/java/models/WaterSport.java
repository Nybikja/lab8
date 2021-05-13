package models;
import enums.SportType;
import lombok.Data;

@Data
public abstract class WaterSport {
    protected String name;
    protected int amountOfPlayers;
    protected int price;
    protected SportType sportType;

    WaterSport(String name, int amountOfPlayers, int price, SportType sportType) {
        this.name = name;
        this.amountOfPlayers = amountOfPlayers;
        this.price = price;
        this.sportType = sportType;
    }

    protected WaterSport() {
    }
}

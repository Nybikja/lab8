package models;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import enums.SportType;

@EqualsAndHashCode(callSuper = true)
@Data
@ToString(callSuper = true)
public class TransportCompetitions extends WaterSport {
    private String typeOfEngine;
    private int horsePower;

    public TransportCompetitions(String name, int amountOfPlayers, int price, SportType sportType, String typeOfEngine,
                         int horsePower) {
        super(name, amountOfPlayers, price, sportType);
        this.typeOfEngine = typeOfEngine;
        this.horsePower = horsePower;
    }
}

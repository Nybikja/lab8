package models;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import enums.SportType;

@EqualsAndHashCode(callSuper = true)
@Data
@ToString(callSuper = true)
public class GamesWithBall extends WaterSport{
    private String typeOfBall;
    private String uniformColor;

    public GamesWithBall(String name, int amountOfPlayers, int price, SportType sportType, String typeOfBall,
                         String uniformColor) {
        super(name, amountOfPlayers, price, sportType);
        this.typeOfBall = typeOfBall;
        this.uniformColor = uniformColor;
    }
}

package org.rest.models;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@EqualsAndHashCode(callSuper = true)
@Data
@ToString(callSuper = true)
public class GamesWithBall extends WaterSport{
    private String typeOfBall;
    private String uniformColor;

    public GamesWithBall(int id, String name, int amountOfPlayers, int price, String typeOfBall,
                         String uniformColor) {
        super(id, name, amountOfPlayers, price);
        this.typeOfBall = typeOfBall;
        this.uniformColor = uniformColor;
    }
}

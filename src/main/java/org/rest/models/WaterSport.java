package org.rest.models;
import lombok.*;


import javax.persistence.*;


@Data
@Entity
@NoArgsConstructor

public class WaterSport {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    protected String name;
    protected int amountOfPlayers;
    protected int price;

    public WaterSport(int id, String name, int amountOfPlayers, int price) {
        this.id = id;
        this.name = name;
        this.amountOfPlayers = amountOfPlayers;
        this.price = price;
    }


    public WaterSport copy(){
        return new WaterSport(this.id, this.name, this.amountOfPlayers,
                this.price);
    }

}

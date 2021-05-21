package com.iot.lab.restApi.models;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class TransportCompetitions extends WaterSport {
    private String typeOfEngine;
    private int horsePower;

    public TransportCompetitions(int id, String name, int amountOfPlayers, int price, String typeOfEngine,
                                 int horsePower) {
        super(id, name, amountOfPlayers, price);
        this.typeOfEngine = typeOfEngine;
        this.horsePower = horsePower;
    }
}

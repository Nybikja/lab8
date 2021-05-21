package com.iot.lab.restApi.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class WaterSport {
    private int id;
    protected String name;
    protected int amountOfPlayers;
    protected int price;
}

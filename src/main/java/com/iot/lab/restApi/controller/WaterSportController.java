package com.iot.lab.restApi.controller;

import com.iot.lab.restApi.models.WaterSport;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RequestMapping("/watersport")
@RestController
public class WaterSportController {
    int counter = 0;
    private final Map<Integer, WaterSport> waterSports = new HashMap<>();

    @PostMapping
    public ResponseEntity<Object> addWaterSports(@RequestBody WaterSport waterSport){
        waterSport.setId(counter++);
        waterSports.put(waterSport.getId(), waterSport);
        return ResponseEntity.ok(Collections.singletonMap("id", waterSport.getId()));
    }

    @GetMapping
    public Collection<WaterSport>getWaterSport(){
        return waterSports.values();
    }

    @GetMapping("{id}")
    public ResponseEntity<WaterSport> getWaterSport(@PathVariable("id") int id){
        WaterSport waterSport = waterSports.get(id);
        if(waterSport != null)
            return ResponseEntity.ok(waterSport);
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Object> deleteWaterSport(@PathVariable("id") int id){
        WaterSport penguin = waterSports.get(id);
        if(penguin != null) {
            waterSports.remove(id);
            return ResponseEntity.ok(Collections.singletonMap("id", id));
        }
        return ResponseEntity.notFound().build();
    }

    @PutMapping("{id}")
    public ResponseEntity<WaterSport> updateWaterSport(@RequestBody WaterSport newWaterSport,
                                                       @PathVariable("id") int id){
        WaterSport oldWaterSport = waterSports.get(id);
        if(oldWaterSport != null){
            newWaterSport.setId(id);
            waterSports.replace(id, newWaterSport);
            return ResponseEntity.ok(oldWaterSport);
        }
        return ResponseEntity.notFound().build();
    }

}
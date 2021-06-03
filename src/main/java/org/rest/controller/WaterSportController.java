package org.rest.controller;

import org.rest.models.WaterSport;
import org.rest.services.WaterSportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Collections;

@RequestMapping("/sport")
@RestController
public class WaterSportController {

    private final WaterSportService waterSportService;

    @Autowired
    public WaterSportController(WaterSportService waterSportService) {
        this.waterSportService = waterSportService;
    }

    @PostMapping
    public ResponseEntity<WaterSport> addWaterSports(@RequestBody WaterSport waterSport){
        return ResponseEntity.ok(waterSportService.addWaterSport(waterSport));
    }

    @GetMapping
    public ResponseEntity<Collection<WaterSport>> getWaterSport(){
        return ResponseEntity.ok(waterSportService.getWaterSports());
    }

    @GetMapping("{id}")
    public ResponseEntity<WaterSport> getWaterSport(@PathVariable("id") int id){
        WaterSport waterSport = waterSportService.getWaterSport(id);
        if(waterSport != null)
            return ResponseEntity.ok(waterSport);
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Object> deleteWaterSport(@PathVariable("id") int id){
        int waterSport = waterSportService.deleteWaterSport(id);
        if(waterSport != -1) {
            return ResponseEntity.ok(Collections.singletonMap("id", id));
        }
        return ResponseEntity.notFound().build();
    }

    @PutMapping("{id}")
    public ResponseEntity<WaterSport> updateWaterSport(@RequestBody WaterSport newWaterSport,
                                                       @PathVariable("id") int id){
        WaterSport waterSport = waterSportService.updateWaterSport(newWaterSport, id);
        if(waterSport != null){
            return ResponseEntity.ok(waterSport);
        }
        return ResponseEntity.notFound().build();
    }

}
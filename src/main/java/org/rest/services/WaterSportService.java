package org.rest.services;

import org.rest.models.WaterSport;
import org.rest.repositories.WaterSportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

    @Service
    public class WaterSportService {

        private final WaterSportRepository waterSportRepository;

        @Autowired
        public WaterSportService(WaterSportRepository waterSportRepository) {
            this.waterSportRepository = waterSportRepository;
        }


        public WaterSport addWaterSport(WaterSport waterSport){
            waterSportRepository.save(waterSport);
            return waterSport;
        }

        public List<WaterSport> getWaterSports(){
            return StreamSupport.stream(waterSportRepository.findAll().spliterator(), false)
                    .collect(Collectors.toList());
        }

        public WaterSport getWaterSport(int id){
            return waterSportRepository.findById(id).orElse(null);
        }

        public int deleteWaterSport(int id) {
            WaterSport waterSport = waterSportRepository.findById(id).orElse(null);
            if (waterSport != null) {
                waterSportRepository.deleteById(id);
                return id;
            }
            return -1;
        }

        public WaterSport updateWaterSport(WaterSport newWaterSport, int id){
            WaterSport waterSport = waterSportRepository.findById(id).orElse(null);
            if(waterSport != null){
                waterSport = waterSport.copy();
                newWaterSport.setId(id);
                waterSportRepository.save(newWaterSport);
            }
            return waterSport;
        }
    }





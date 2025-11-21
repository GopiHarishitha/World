package com.example.World.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.World.Model.City;
import com.example.World.Service.CityService;

@RestController
@RequestMapping("/city")
public class CityController {

    private final CityService cityService;

    @Autowired
    public CityController(CityService cityService) {
        this.cityService = cityService;
    }
    
    @PostMapping("/add-city")
    public ResponseEntity<City> addCity(@RequestBody City city) {
        System.out.println("City: "+ city);
        City savedCity = cityService.addCity(city);
        return ResponseEntity.ok(savedCity); 
    }

    @DeleteMapping("/delete-city")
    public ResponseEntity deleteCity(@RequestParam Integer id) {
        cityService.deleteCity(id);
        return ResponseEntity.ok().build();
    }
}

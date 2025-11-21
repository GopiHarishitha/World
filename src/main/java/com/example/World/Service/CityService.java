package com.example.World.Service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.World.Model.City;
import com.example.World.Repository.CityRepository;
import org.springframework.stereotype.Service;

@Service
public class CityService {

    @Autowired
    CityRepository cityRepository;
    
    public City addCity(City city){
        City savedCity = cityRepository.save(city);
        return savedCity;
    }

    public void deleteCity(Integer id) {
        cityRepository.deleteById(id);
    }

}

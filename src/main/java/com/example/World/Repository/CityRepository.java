package com.example.World.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.World.Model.City;

public interface CityRepository extends JpaRepository<City, Integer> {
    
}

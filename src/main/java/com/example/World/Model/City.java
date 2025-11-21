package com.example.World.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @JsonProperty("name")
    @Column(name = "Name")
    private String name;

    @JsonProperty("countryCode")
    @Column(name = "CountryCode")
    private String countryCode;

    @JsonProperty("district")
    @Column(name = "District")
    private String district;

    @JsonProperty("population")
    @Column(name = "Population")
    private Integer population;
}

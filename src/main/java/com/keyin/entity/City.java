package com.keyin.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String state;
    private int population;

    @OneToMany(mappedBy = "city", cascade = CascadeType.ALL)
    private Set<Airport> airports;

    // Constructors, getters, and setters

    public City() {
        // Default constructor
    }

    public City(String name, String state, int population) {
        this.name = name;
        this.state = state;
        this.population = population;
    }

    // Other constructors if needed

    // Getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public Set<Airport> getAirports() {
        return airports;
    }

    public void setAirports(Set<Airport> airports) {
        this.airports = airports;
    }
}



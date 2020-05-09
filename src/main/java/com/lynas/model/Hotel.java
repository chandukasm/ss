package com.lynas.model;


import lombok.Data;

import javax.persistence.*;

@Entity

public @Data
class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    private String name;

    @ManyToOne()
    private City city;


    public Hotel() {
    }


    public Hotel(String name,City city) {
        this.name = name;
        this.city = city;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
}

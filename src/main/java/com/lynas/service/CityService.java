package com.lynas.service;

import com.lynas.model.City;

import java.util.List;

public interface CityService {
    void InsertCity(City city);
    List<City> getAll();
    City getById(int id);
}

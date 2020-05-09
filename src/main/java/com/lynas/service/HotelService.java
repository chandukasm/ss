package com.lynas.service;

import com.lynas.model.Hotel;

import java.util.List;

public interface HotelService {
    void insertHotel(Hotel hotel);
    List<Hotel> getAll();
}

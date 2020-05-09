package com.lynas.controller;

import com.google.gson.Gson;
import com.lynas.model.AppUser;
import com.lynas.model.City;
import com.lynas.model.Hotel;
import com.lynas.service.AppUserService;
import com.lynas.service.CityService;
import com.lynas.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by sazzad on 2/11/16
 */
@Controller
public class HomeController {

    @Autowired
    AppUserService appUserService;

    @Autowired
    CityService cityService;

    @Autowired
    HotelService hotelService;


    @RequestMapping(value = "/")
    public String home() {

        return "home";
    }

    @RequestMapping(value = "/addAppUser")
    public String addAppUser() {
        appUserService.insertAppUser(new AppUser("userx", "pass"));
        return "home";
    }


    @RequestMapping(value = "/addCity")
    public String addCity() {
        cityService.InsertCity(new City("colombo"));
        return "home";


    }


    @RequestMapping(value = "/addHotel")
    public String addHotel() {
        City city = cityService.getById(1);
        hotelService.insertHotel(new Hotel("shangrilla",city));
        return "home";


    }

    @ResponseBody
    @RequestMapping(value = "/getAll")
    public List<AppUser> getAll() {
        List<AppUser> list = appUserService.getAllAppUsers();
        return list;
    }


    @ResponseBody
    @RequestMapping(value = "/byId/{id}")
    public AppUser byId(@PathVariable int id) {

        AppUser user = appUserService.getById(id);
        return user;
    }
}

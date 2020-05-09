package com.lynas.service.impl;

import com.lynas.model.City;
import com.lynas.service.CityService;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private SessionFactory sessionFactory;


    @Override
    @Transactional
    public void InsertCity(City city) {
        sessionFactory.getCurrentSession().save(city);
    }

    @Override
    @Transactional
    public List<City> getAll() {
        Criteria criteria = sessionFactory.getCurrentSession().createCriteria(City.class);
        return criteria.list();
    }

    @Override
    @Transactional
    public City getById(int id) {
        City city = sessionFactory.getCurrentSession().byId(City.class).load(id);
        System.out.println(city.getName());
        return city;
    }


}

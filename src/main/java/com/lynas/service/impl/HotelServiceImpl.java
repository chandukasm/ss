package com.lynas.service.impl;

import com.lynas.model.Hotel;
import com.lynas.service.HotelService;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @Transactional
    public void insertHotel(Hotel hotel) {
        sessionFactory.getCurrentSession().save(hotel);

    }

    @Override
    public List<Hotel> getAll() {
        Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Hotel.class);
        return criteria.list();
    }
}

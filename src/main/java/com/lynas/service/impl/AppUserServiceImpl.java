package com.lynas.service.impl;

import com.lynas.model.AppUser;
import com.lynas.service.AppUserService;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by sazzad on 2/11/16.
 */
@Service
public class AppUserServiceImpl implements AppUserService {

    @Autowired
    private SessionFactory sessionFactory;


    @Transactional
    public void insertAppUser(AppUser appUser) {
        sessionFactory
                .getCurrentSession()
                .save(appUser);

    }


    @Transactional
    public List<AppUser> getAllAppUsers() {


        Criteria criteria = sessionFactory.getCurrentSession().createCriteria(AppUser.class);
        return criteria.list();



    }

    @Transactional
    public AppUser getById(int id) {
        AppUser user= (AppUser) sessionFactory.getCurrentSession().byId(AppUser.class).load(id);
        System.out.println(user.getUserName());
        return user;
    }
}

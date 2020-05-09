package com.lynas.service;

import com.lynas.model.AppUser;

import java.util.List;

/**
 * Created by sazzad on 2/11/16.
 */
public interface AppUserService {
    void insertAppUser(AppUser appUser);
    List<AppUser> getAllAppUsers();
    AppUser getById(int id);

}

package com.ipoca.my.shop.web.admin.service;


import com.ipoca.my.shop.domain.User;

public interface UserService {

    public User login(String email, String password);
}

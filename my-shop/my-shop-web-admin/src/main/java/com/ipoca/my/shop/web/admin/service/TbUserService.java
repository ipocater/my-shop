package com.ipoca.my.shop.web.admin.service;

import com.ipoca.my.shop.domain.TbUser;
import com.ipoca.my.shop.domain.User;

import java.util.List;

public interface TbUserService {
    /**
     * 查询全部用户信息
     * @return
     */
    public List<TbUser> selectAll();

    TbUser login(String email, String password);
}

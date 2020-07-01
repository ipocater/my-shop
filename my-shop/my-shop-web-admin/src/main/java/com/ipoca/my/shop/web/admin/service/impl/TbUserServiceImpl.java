package com.ipoca.my.shop.web.admin.service.impl;

import com.ipoca.my.shop.domain.TbUser;
import com.ipoca.my.shop.domain.User;
import com.ipoca.my.shop.web.admin.dao.TbUserDao;
import com.ipoca.my.shop.web.admin.service.TbUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TbUserServiceImpl implements TbUserService {
    @Autowired
    private TbUserDao tbUserDao;

    @Override
    public List<TbUser> selectAll() {
        return tbUserDao.selectAll();
    }

    @Override
    public TbUser login(String email, String password) {
        TbUser tbUser = new TbUser();
        tbUser.setEmail(email);
        tbUser.setPassword(password);
        List<TbUser> tbUsers = tbUserDao.selectByCondition(tbUser);
        if (tbUsers!=null && tbUsers.size()>0){
            return tbUsers.get(0);
        }else {
            return null;
        }
    }
}

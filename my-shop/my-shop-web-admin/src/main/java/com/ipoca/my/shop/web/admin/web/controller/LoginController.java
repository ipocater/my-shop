package com.ipoca.my.shop.web.admin.web.controller;


import com.ipoca.my.shop.commons.constant.ConstantUtils;
import com.ipoca.my.shop.domain.TbUser;
import com.ipoca.my.shop.domain.User;
import com.ipoca.my.shop.web.admin.service.TbUserService;
import com.ipoca.my.shop.web.admin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class LoginController{

    @Autowired
    private UserService userService;

    @Autowired
    private TbUserService tbUserService;

    @RequestMapping(value = {"","login"},method = RequestMethod.GET)
    public String login(){
        return "login";
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String login(String email, String password, HttpServletRequest request, HttpServletResponse response){
       // User admin = userService.login(email,password);

        TbUser admin = tbUserService.login(email,password);

        //登陆成功
        if (admin != null){
            request.getSession().setAttribute(ConstantUtils.SESSION_USER,admin);
            return "redirect:/main";
        }
        //登陆失败
        else {
            return login();
        }
    }

}

package com.ipoca.my.shop.web.admin.dao;

import com.ipoca.my.shop.domain.TbUser;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TbUserDao {

    /**
     * 查询全部用户信息
     * @return
     */
    public List<TbUser> selectAll();

    public void insert(TbUser tbUser);

    public void delete(Long id);

    public TbUser getById(Long id);

    public void update(TbUser tbUser);

    public List<TbUser> selectByName(String username);

}

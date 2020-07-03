package com.ipoca.my.shop.web.admin.dao;

import com.ipoca.my.shop.domain.TbContent;
import org.springframework.stereotype.Repository;

@Repository
public interface TbContentDao {

    void insert(TbContent tbContent);
}

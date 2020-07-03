package com.ipoca.my.shop.web.admin.dao;

import com.ipoca.my.shop.domain.TbContentCategory;
import org.springframework.stereotype.Repository;

@Repository
public interface TbContentCategoryDao {
    void insert(TbContentCategory tbContentCategory);

}

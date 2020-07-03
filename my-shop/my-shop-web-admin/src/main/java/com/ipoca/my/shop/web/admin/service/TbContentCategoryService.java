package com.ipoca.my.shop.web.admin.service;

import com.ipoca.my.shop.domain.TbContent;
import com.ipoca.my.shop.domain.TbContentCategory;

public interface TbContentCategoryService {
    void save(TbContentCategory tbContentCategory, TbContent tbContent);
}

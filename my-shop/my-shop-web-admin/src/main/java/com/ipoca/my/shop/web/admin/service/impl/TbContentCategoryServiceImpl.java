package com.ipoca.my.shop.web.admin.service.impl;

import com.ipoca.my.shop.domain.TbContent;
import com.ipoca.my.shop.domain.TbContentCategory;
import com.ipoca.my.shop.web.admin.dao.TbContentCategoryDao;
import com.ipoca.my.shop.web.admin.service.TbContentCategoryService;
import com.ipoca.my.shop.web.admin.service.TbContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TbContentCategoryServiceImpl implements TbContentCategoryService {

    @Autowired
    TbContentCategoryDao tbContentCategoryDao;

    @Autowired
    TbContentService tbContentService;


    @Override
    public void save(TbContentCategory tbContentCategory, TbContent tbContent) {
        tbContentCategoryDao.insert(tbContentCategory);
        tbContentService.save(tbContent);
    }
}

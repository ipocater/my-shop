package com.ipoca.my.shop.web.admin.service.impl;

import com.ipoca.my.shop.domain.TbContent;
import com.ipoca.my.shop.web.admin.dao.TbContentDao;
import com.ipoca.my.shop.web.admin.service.TbContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TbContentServiceImpl implements TbContentService {

    @Autowired
    TbContentDao tbContentDao;

    @Override
    public void save(TbContent tbContent) {
        tbContentDao.insert(tbContent);
    }
}

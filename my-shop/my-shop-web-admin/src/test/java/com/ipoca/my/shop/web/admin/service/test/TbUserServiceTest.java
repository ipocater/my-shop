package com.ipoca.my.shop.web.admin.service.test;

import com.ipoca.my.shop.domain.TbContent;
import com.ipoca.my.shop.domain.TbContentCategory;
import com.ipoca.my.shop.domain.TbUser;
import com.ipoca.my.shop.web.admin.dao.TbUserDao;
import com.ipoca.my.shop.web.admin.service.TbContentCategoryService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-context.xml", "classpath:spring-context-druid.xml", "classpath:spring-context-mybatis.xml"})
public class TbUserServiceTest {
    @Autowired
    private TbUserDao tbUserDao;

    @Autowired
    private TbContentCategoryService tbContentCategoryService;

//    @Test
//    public void testSelectAll() {
//        List<TbUser> tbUsers = tbUserDao.selectAll();
//        for (TbUser tbUser : tbUsers) {
//            System.out.println(tbUser.getUsername());
//        }
//    }

    @Test
    public void testDBAffairs(){
        TbContent tbContent = new TbContent();
        tbContent.setContent("测试目录0703");
        TbContentCategory tbContentCategory = new TbContentCategory();
        tbContentCategory.setId(111L);
        tbContentCategory.setName("测试目录0703");
        tbContentCategoryService.save(tbContentCategory,tbContent);

    }
}

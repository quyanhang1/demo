package com.how2java.springboot.mapper;

import com.how2java.springboot.pojo.Category;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2018/3/5.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryMapperTest {
    @Autowired
    private CategoryMapper categoryMapper;
    @Test
    public void selectByPrimaryKey() throws Exception {
        Category category = categoryMapper.selectByPrimaryKey(1);
        System.out.println(category.getName());

    }

}
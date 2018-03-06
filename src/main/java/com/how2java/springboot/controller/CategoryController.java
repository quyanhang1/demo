package com.how2java.springboot.controller;

import com.how2java.springboot.mapper.CategoryMapper;
import com.how2java.springboot.pojo.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Administrator on 2018/3/5.
 */

@RestController
public class CategoryController {

    @Autowired
    private CategoryMapper categoryMapper;


    @GetMapping("/a")
    public String test() {
        System.out.println("进入方法了");
//        List<Category> cs=categoryMapper.findAll();
//        m.addAttribute("cs", cs);
        return "aaaaaaa";
    }

    @GetMapping("/a/{id}")
    public Category select(@PathVariable("id") Integer id){
        System.out.println("进入方法，通过url获取的id是："+id);
        Category category = categoryMapper.selectByPrimaryKey(id);
        return  category;
    }
}

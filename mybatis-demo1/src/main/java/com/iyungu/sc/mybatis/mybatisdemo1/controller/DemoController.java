package com.iyungu.sc.mybatis.mybatisdemo1.controller;

import com.iyungu.sc.mybatis.mybatisdemo1.entity.Test;
import com.iyungu.sc.mybatis.mybatisdemo1.service.DemoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by yaochenglong
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    private DemoService demoService;


    @RequestMapping("/list")
    @ResponseBody
    public List<Test> list(){
        return demoService.list();
    }


    @RequestMapping("/save")
    @ResponseBody
    public int save(){
        return demoService.save();
    }
}
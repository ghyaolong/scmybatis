package com.iyungu.sc.mybatis.mybatisdemo1.client;

import com.iyungu.sc.mybatis.mybatisdemo1.entity.Test;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(value = "demo2" ,fallback = Demo2ClientHystric.class)
public interface Demo2Client {
    @RequestMapping(value = "/demo/list",method = RequestMethod.GET)
    List<Test> list();


    @RequestMapping(value = "/demo/save",method = RequestMethod.GET)
    int save();
}

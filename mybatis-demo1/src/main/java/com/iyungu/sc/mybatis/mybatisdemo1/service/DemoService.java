package com.iyungu.sc.mybatis.mybatisdemo1.service;

import com.iyungu.sc.mybatis.mybatisdemo1.entity.Test;

import java.util.List;

public interface DemoService  {

    List<Test> list();

    int save();

}
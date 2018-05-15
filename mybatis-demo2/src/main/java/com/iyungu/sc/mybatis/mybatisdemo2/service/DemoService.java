package com.iyungu.sc.mybatis.mybatisdemo2.service;

import com.iyungu.sc.mybatis.mybatisdemo2.entity.Test;

import java.util.List;

public interface DemoService  {

    List<Test> list();

    int save();

}
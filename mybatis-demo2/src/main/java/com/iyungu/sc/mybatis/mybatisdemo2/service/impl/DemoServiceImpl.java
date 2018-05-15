package com.iyungu.sc.mybatis.mybatisdemo2.service.impl;

import com.codingapi.tx.annotation.ITxTransaction;
import com.iyungu.sc.mybatis.mybatisdemo2.dao.TestMapper;
import com.iyungu.sc.mybatis.mybatisdemo2.entity.Test;
import com.iyungu.sc.mybatis.mybatisdemo2.service.DemoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DemoServiceImpl implements DemoService,ITxTransaction {

    @Autowired
    private TestMapper testMapper;



    @Override
    public List<Test> list() {
        return testMapper.findAll();
    }


    @Override
    @Transactional
    public int save() {

        int rs = testMapper.save("mybatis-hello-2");

        return rs;
    }
}

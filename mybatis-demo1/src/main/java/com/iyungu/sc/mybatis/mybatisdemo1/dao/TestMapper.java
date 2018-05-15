package com.iyungu.sc.mybatis.mybatisdemo1.dao;

import com.iyungu.sc.mybatis.mybatisdemo1.entity.Test;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

import feign.Param;

@Mapper
public interface TestMapper {


    @Select("SELECT * FROM T_TEST")
    List<Test> findAll();

    @Insert("INSERT INTO T_TEST(NAME) VALUES(#{name})")
    int save(@Param("name") String name);

}
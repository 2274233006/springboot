package com.night.mapper;

import com.night.pojo.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface StudentMapper {

     List<Student> list();

    int del(String id);
}
package com.night.service.impl;

import com.night.mapper.StudentMapper;
import com.night.pojo.Student;
import com.night.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Student> list() {
        return studentMapper.list();
    }

    @Override
    public String del(String id) {
        int i =  studentMapper.del(id);
        return "删除成功";
    }
}
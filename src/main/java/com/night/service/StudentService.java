package com.night.service;

import com.night.pojo.Student;

import java.util.List;

public interface StudentService {
    List<Student> list();

    String del(String id);
}

package com.night.controller;


import com.night.pojo.Student;
import com.night.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("list")
    public List<Student> list(){
        return studentService.list();
    }

    @GetMapping("del/{id}")
    public String del(@PathVariable String id){
        return studentService.del(id);
    }

}
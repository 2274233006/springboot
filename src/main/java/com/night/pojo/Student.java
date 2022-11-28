package com.night.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    private int id;

    private String student_no;

    private String student_name;

    private int age;

    private String student_class;

    private String remark;

}
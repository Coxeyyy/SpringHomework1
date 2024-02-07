package com.coxey.app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.List;

@Component()
@ComponentScan("com.coxey.app.configuration")
public class Teacher {
    private List<Student> studentList;

    @Autowired
    public Teacher(List<Student> studentList) {
        this.studentList = studentList;
    }

    public List<Student> getStudentList() {
        return studentList;
    }
}

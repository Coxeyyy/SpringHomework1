package com.coxey.app.model;

import javax.annotation.PostConstruct;
import java.util.Map;
import java.util.Objects;

public class Student {
    private String name;
    private Map<String, Double> grades;
    private boolean ifEnrolled = false;

    public Student(String name, Map<String, Double> grades) {
        this.name = name;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Double> getGrades() {
        return grades;
    }

    public void setGrades(Map<String, Double> grades) {
        this.grades = grades;
    }

    public boolean isIfEnrolled() {
        return ifEnrolled;
    }

    public void setIfEnrolled(boolean ifEnrolled) {
        this.ifEnrolled = ifEnrolled;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grades=" + grades +
                ", ifEnrolled=" + ifEnrolled +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return ifEnrolled == student.ifEnrolled && Objects.equals(name, student.name) && Objects.equals(grades, student.grades);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, grades, ifEnrolled);
    }

    @PostConstruct
    public void init() {
        double sumGrades = 0;
        for (var temp : grades.values()) {
            sumGrades += temp;
        }
        sumGrades /= grades.values().size();
        if (sumGrades >= 3.0) {
            ifEnrolled = true;
        }
    }
}

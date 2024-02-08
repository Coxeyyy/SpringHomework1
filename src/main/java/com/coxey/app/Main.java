package com.coxey.app;

import com.coxey.app.configuration.ConfigSecondContext;
import com.coxey.app.model.Teacher;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext xmlContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        AnnotationConfigApplicationContext javaContext = new AnnotationConfigApplicationContext(ConfigSecondContext.class);

        Teacher teacherXmlContext = xmlContext.getBean("teacher", Teacher.class);
        System.out.println(teacherXmlContext.getStudentList());

        System.out.println("#################################################");

        Teacher teacherJavaContext = javaContext.getBean("teacher", Teacher.class);
        System.out.println(teacherJavaContext.getStudentList());

        javaContext.close();
        xmlContext.close();
    }
}

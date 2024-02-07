package com.coxey.app.configuration;

import com.coxey.app.model.Student;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.util.LinkedHashMap;
import java.util.Map;

@Component
public class PostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof Student) {
            Student student = (Student) bean;
            if (student.getName().equals("Jil")) {
                Map<String, Double> grades = new LinkedHashMap<>();
                for (var temp : student.getGrades().keySet()) {
                    grades.put(temp, 3.0);
                }
                student.setGrades(grades);
            }
        } // Хочу попытаться переделать на стримы
        return bean;
    }
}

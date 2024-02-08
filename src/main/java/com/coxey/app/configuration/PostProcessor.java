package com.coxey.app.configuration;

import com.coxey.app.model.Student;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;


public class PostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof Student) {
            Student student = (Student) bean;
            if (student.getName().equals("Jil")) {
                student.getGrades().replaceAll((key, grade) -> grade + 3.0);
            }
        }
        return bean;
    }
}

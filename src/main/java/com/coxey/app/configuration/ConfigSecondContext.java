package com.coxey.app.configuration;

import com.coxey.app.model.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedHashMap;
import java.util.Map;

@Configuration
@ComponentScan("com.coxey.app.model")
public class ConfigSecondContext {
    @Bean
    public Student studentArtem2() {
        Map<String, Double> grades = new LinkedHashMap<>();
        grades.put("Math", 2.0);
        grades.put("Russian language", 5.0);
        grades.put("Physics", 3.0);
        return new Student("Artem", grades);
    }

    @Bean
    public Student studentDanil2() {
        Map<String, Double> grades = new LinkedHashMap<>();
        grades.put("Math", 1.0);
        grades.put("Russian language", 1.0);
        grades.put("Physics", 1.0);
        return new Student("Danil", grades);
    }

    @Bean
    public Student studentJil2() {
        Map<String, Double> grades = new LinkedHashMap<>();
        grades.put("Math", 2.0);
        grades.put("Russian language", 1.0);
        grades.put("Physics", 1.0);
        return new Student("Jil", grades);
    }

    @Bean
    public PostProcessor PostProcessor() {
        return new PostProcessor();
    }
}

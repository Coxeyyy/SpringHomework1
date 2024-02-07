package com.coxey.app.configuration;

import com.coxey.app.model.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

@Configuration
public class ConfigSecondContext {
    @Bean
    public Student studentArtem2() {
        Map<String, Double> grades = Map.of(
                "Math", 2.0,
                "Russian language", 5.0,
                "Physics", 3.0
        );
        return new Student("Artem", grades);
    }

    @Bean
    public Student studentDanil2() {
        Map<String, Double> grades = Map.of(
                "Math", 1.0,
                "Russian language", 1.0,
                "Physics", 1.0
        );
        return new Student("Danil", grades);
    }

    @Bean
    public Student studentJil2() {
        Map<String, Double> grades = Map.of(
                "Math", 2.0,
                "Russian language", 1.0,
                "Physics", 1.0
        );
        return new Student("Jil", grades);
    }

    @Bean
    public PostProcessor PostProcessor() {
        return new PostProcessor();
    }
}

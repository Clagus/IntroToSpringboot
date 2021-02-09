package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student colin = new Student(
                    "Colin",
                    "colin@gmail.com",
                    LocalDate.of(1994, JUNE, 4)
            );

            Student alex = new Student(
                    "Alex",
                    "alex@gmail.com",
                    LocalDate.of(2000, FEBRUARY, 10)
            );

            repository.saveAll(List.of(colin, alex));
        };
    }
}

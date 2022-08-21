package com.sapienscorp.sapiens.students;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student ashwathy = new Student(
                    "Ashwathy",
                    LocalDate.of(2017, Month.AUGUST,27),
                    "ashwathy@gmail.com",
                    5
            );
            Student sruthy = new Student(
                    "Sruthy",
                    LocalDate.of(2017, Month.AUGUST,27),
                    "sruthy@gmail.com",
                    5
            );
            repository.saveAll(List.of(ashwathy,sruthy));
        };
    }
}

package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student mateusz = new Student(
                    "Mateusz",
                    "matix250@gmail.com",
                    LocalDate.of(1993, Month.MARCH, 25)
            );
            Student sandra = new Student(
                    "Sandra",
                    "sandra@gmail.com",
                    LocalDate.of(1993, Month.JANUARY, 25)
            );

            repository.saveAll(
                    List.of(mateusz, sandra)
            );
        };

    }
}

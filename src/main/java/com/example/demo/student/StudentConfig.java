package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.JANUARY;

@Configuration
public class StudentConfig {

    @Bean // use of @Bean so this code will run when the app is started
    CommandLineRunner commandLineRunner(StudentRepository repository) { // CommandLineRunner = SpringBoot interface with a run method
        return args -> {
            Student mariam = new Student(
                    "Mariam",
                    "mariam.jamal@gmail.com",
                    LocalDate.of(2000, JANUARY,5)
            );

            Student alex = new Student(
                    "Alex",
                    "alex@gmail.com",
                    LocalDate.of(2010, JANUARY,5)
            );

            repository.saveAll(
                    List.of(mariam, alex)
            );
        };
    }
}

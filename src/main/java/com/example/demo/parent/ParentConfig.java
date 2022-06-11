package com.example.demo.parent;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.APRIL;

@Configuration
public class ParentConfig {
    @Bean
    CommandLineRunner commandLineRunner(ParentRepo parentRepo){
        return args -> {
            Parent X = new Parent(
                    "PA",
                    "PB",
                    "PC",
                    LocalDate.of(2000, APRIL, 22)


            );
            Parent Y = new Parent(
                    "PS",
                    "PT",
                    "PV",
                    LocalDate.of(2000, APRIL, 22)


            );
            parentRepo.saveAll(List.of(X,Y));

        };
    }
}

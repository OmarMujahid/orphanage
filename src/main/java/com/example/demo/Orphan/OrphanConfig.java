package com.example.demo.Orphan;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class OrphanConfig {
    @Bean
    CommandLineRunner commandLineRunner(OrphanRepo orphanRepo){
        return args -> {
            Orphan X = new Orphan(
                    "A",
                    "B",
                    "C",
                    LocalDate.of(2000, APRIL, 22),
                    LocalDate.of(2000, APRIL, 22)


            );
            Orphan Y = new Orphan(
                    "S",
                    "T",
                    "V",
                    LocalDate.of(2000, APRIL, 22),
                    LocalDate.of(2000, APRIL, 22)


            );
            orphanRepo.saveAll(List.of(X,Y));

        };
    }
}

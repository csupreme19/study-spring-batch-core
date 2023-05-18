package com.example.springbatchcore;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableBatchProcessing
public class SpringBatchCoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBatchCoreApplication.class, args);
    }

}

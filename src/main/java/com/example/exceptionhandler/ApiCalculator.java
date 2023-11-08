package com.example.exceptionhandler;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Calculator Api Rest", version = "1", description = "API developed in studies"))
public class ApiCalculator {



    public static void main(String[] args) {
        SpringApplication.run(ApiCalculator.class, args);
    }

}

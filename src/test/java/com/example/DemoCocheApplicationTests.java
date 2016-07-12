package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoCocheApplicationTests {

    public static void main(String[] args) {
        ConfigurableApplicationContext context =SpringApplication.run(DemoCocheApplication.class, args);

        CocheService personaService=context.getBean(CocheService.class);

        personaService.testCoches();
    }
}

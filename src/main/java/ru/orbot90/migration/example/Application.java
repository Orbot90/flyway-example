package ru.orbot90.migration.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by Iurii_Plevako on 2/2/2017.
 */
@EnableAutoConfiguration
@ComponentScan
@PropertySource("classpath:app.properties")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}

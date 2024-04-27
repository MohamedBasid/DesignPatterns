package com.example.designpatterns;

import com.example.designpatterns.singleton.Singleton;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternsApplication {

    public static void main(String[] args) {

        SpringApplication.run(DesignPatternsApplication.class, args);

        Singleton singleton = Singleton.getInstance();

    }

}

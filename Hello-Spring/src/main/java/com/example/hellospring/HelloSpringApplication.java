package com.example.hellospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloSpringApplication {

    public static void main(String[] args) {

        SpringApplication.run(HelloSpringApplication.class, args);
    }
    @GetMapping("/")
        public String hello(@RequestParam(value = "name", defaultValue = "Oscar")String name) {
            return String.format("Hello %s!", name);

    }

}

package com.example.springapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class SpringAppApplication {

    public static void main(String[] args) {


        SpringApplication.run(SpringAppApplication.class, args);
    }
    @RestController
    class GreetingController{
        @RequestMapping("/hello/{name}")
            String hello(@PathVariable String name){
            return "Hello, " + name + "!";
        }

    }

    @RestController
    public class FormController{

        @RequestMapping("/greeting")
        public String Index( ){
            return "greeting";
        }
    }

    @RequestMapping("/suma")

    public @ResponseBody Float add(
            @RequestParam (name="a") Float a,
            @RequestParam (name="b") Float b) {

        return a + b;
    }
}

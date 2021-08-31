package com.example.springapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
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
    @RequestMapping("/suma")

    public @ResponseBody Float add(
            @RequestParam (name="a") Float a,
            @RequestParam (name="b") Float b) {

        return a + b;
    }
    @RestController
    class FormController{
        @RequestMapping("/greeting")
        String greeting(Model model ){
            model.addAttribute("greeting", new Greeting());
            return "greetings";
        }
    }
    @PostMapping("/greeting")

    public String greetingSubmit(@ModelAttribute Greeting greeting) {

        return "result";

    }


}

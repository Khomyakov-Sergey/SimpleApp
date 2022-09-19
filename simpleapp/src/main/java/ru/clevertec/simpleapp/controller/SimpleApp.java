package ru.clevertec.simpleapp.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.clevertec.simpleapp.model.User;

import java.util.Random;

@RestController
@Slf4j
public class SimpleApp {

    @PostMapping("greetings")
    public String getGreeting(@RequestBody User user){
        int luckyNumber = new Random().nextInt(10);
        String greeting = "Hello, user " + user.getName() + "! Your lucky number is " +  luckyNumber;
        log.info(greeting);
        return greeting;
    }
}

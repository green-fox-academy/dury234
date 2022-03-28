package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class FizzController {
    private static AtomicLong counter = new AtomicLong(0);
    private int fontSize = 18;
    private String keyword;

    @RequestMapping("fizzbuzz")
    public String greeting() {
        counter.incrementAndGet();

        if (counter.intValue() % 3 == 0) {
            if (counter.intValue() % 5 == 0) {
                if (counter.intValue() % 7 == 0) {
                    keyword = "FizzBuzzWoof";
                    fontSize = 72;
                } else {
                    keyword = "FizzBuzz";
                    fontSize = 48;
                }
            } else if (counter.intValue() % 7 == 0) {
                keyword = "FizzWoof";
                fontSize = 48;
            } else {
                keyword = "Fizz";
                fontSize = 24;
            }
        } else if (counter.intValue() % 5 == 0) {
            if (counter.intValue() % 7 == 0) {
                keyword = "BuzzWoof";
                fontSize = 48;
            } else {
                keyword = "Buzz";
                fontSize = 24;
            }
        } else if (counter.intValue() % 7 == 0) {
            keyword = "Woof";
            fontSize = 24;
        } else {
            fontSize = 18;
            keyword = counter.toString();
        }

        return "<p style=\"font-size:" + fontSize + "px\">Hello! This site was loaded " + keyword + " times since last server start.";
    }
}

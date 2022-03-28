package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.awt.*;

@Controller
public class HelloDiffController {

    String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
            "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
            "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
            "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};

    @RequestMapping("difflang")
    @ResponseBody
    public String handleDifflang(@RequestParam(value = "font-size", defaultValue = "16") int fontSize, @RequestParam(value = "color", defaultValue = "black") String color) {
        return String.format("<p style=\"font-size: %d; color: %s\">" + hellos[(int) (Math.random() * hellos.length)] + "</p>",
                fontSize,
                color);
        //        return "<p style=\"font-size:" + fontSize + "px; color:" + color + "\">" + hellos[(int) (Math.random() * hellos.length)] + "</p>";
    }
}

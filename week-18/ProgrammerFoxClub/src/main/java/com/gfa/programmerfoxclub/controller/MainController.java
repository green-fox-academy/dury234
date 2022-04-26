package com.gfa.programmerfoxclub.controller;

import com.gfa.programmerfoxclub.model.Fox;
import com.gfa.programmerfoxclub.model.Tricks;
import com.gfa.programmerfoxclub.service.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.Objects;

@Controller
public class MainController {

    @Autowired
    private FoxService foxService;

    @GetMapping("/")
    public String getIndex(Model model, @Valid @RequestParam(value = "name", required = false) String name) {
        if (Objects.isNull(name)) {
            return "redirect:/login";
        } else {
            foxService.setFoxName(name);
            model.addAttribute("foxService", foxService);
            return "index";
        }
    }

    @GetMapping("/login")
    public String getLogin() {
        return "login";
    }

    @PostMapping("/login")
    public String postLogin(@Valid @RequestParam("name") String name) {
        return "redirect:/?name=" + name;
    }

    @GetMapping("/nutritionStore")
    public String getStore(@RequestParam("name") String name, Model model) {
        model.addAttribute(foxService);
        return "nutritionStore";
    }

    @PostMapping("/nutritionStore")
    public String postStore(@RequestParam("food") String food, @RequestParam("drink") String drink) {
        foxService.setFoodDrink(food, drink);
        return "redirect:/?name=" + foxService.getFoxName();
    }

    @GetMapping("/trickCenter")
    public String getTrickCenter(@RequestParam("name") String name, Model model) {
        model.addAttribute(foxService);
        return "trickCenter";
    }

    @PostMapping("/trickCenter")
    public String postTricks(@RequestParam("trick") String trick) {
        foxService.learnTrick(trick);
        return "redirect:/?name=" + foxService.getFoxName();
    }

}

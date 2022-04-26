package com.gfa.webappdi.controller;

import com.gfa.webappdi.service.useful.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UsefulController {

    private UtilityService utilityService;

    @Autowired
    UsefulController(UtilityService utilityService) {
        this.utilityService = utilityService;
    }

    @GetMapping("/useful")
    public String getUseful() {
        return "useful";
    }

    @GetMapping("/useful/colored")
    public String getUsefulColored(Model model) {
        model.addAttribute(utilityService);
        return "colored";
    }

    @GetMapping("/useful/email")
    public String getEmail(Model model, @RequestParam String email) {

        if (utilityService.validateEmail(email)) {
            model.addAttribute("validation", email + " is a valid email address");
            model.addAttribute("color", "green");
        } else {
            model.addAttribute("validation", email + " is not a valid email address");
            model.addAttribute("color", "red");
        }
        return "email";
    }

    @GetMapping("/useful/caesar-encode")
    public String getCaesarEncode(Model model, @RequestParam(value = "text", required = false) String text, @RequestParam(value = "number", required = false) Integer number) {
        if (number != null)
        model.addAttribute("encoded", utilityService.caesar(text, number));
        return "caesar";
    }

    @GetMapping("/useful/caesar-decode")
    public String getCaesarDecode(Model model, @RequestParam(value = "text", required = false) String text, @RequestParam(value = "number", required = false) Integer number) {
        if (number != null)
        model.addAttribute("encoded", utilityService.caesar(text, 0 - number));
        return "caesar";
    }

}

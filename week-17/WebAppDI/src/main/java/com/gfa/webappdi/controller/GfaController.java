package com.gfa.webappdi.controller;

import com.gfa.webappdi.service.greenfoxapp.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GfaController {

    private StudentService studentService;

    @Autowired
    GfaController(StudentService studentService) {
        this.studentService = studentService;
    }


    @GetMapping("/gfa")
    public String getGfa(Model model) {
        model.addAttribute(studentService);
        return "GFA/gfahome";
    }

    @GetMapping("/gfa/list")
    public String getList(Model model) {
        model.addAttribute("students", studentService.findAll());
        return "GFA/list";
    }

    @GetMapping("/gfa/add")
    public String getAdd() {
        return "GFA/add";
    }

    @PostMapping("/gfa/save")
    public String postSave(@RequestParam("name") String name, Model model) {
        studentService.save(name);
        model.addAttribute("name", name);
        return "GFA/save";
    }

    @GetMapping("/gfa/check")
    public String getCheck() {
        return "GFA/check";
    }

    @PostMapping("/gfa/checked")
    public String postCheck(@RequestParam("name") String name, Model model) {
        if (studentService.checkStudent(name)) {
            model.addAttribute("text", name + " is in this class");
        } else {
            model.addAttribute("text", name + " is not in this class");
        }
        return "GFA/checked";
    }


}

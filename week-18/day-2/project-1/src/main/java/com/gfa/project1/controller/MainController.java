package com.gfa.project1.controller;

import com.gfa.project1.model.Todo;
import com.gfa.project1.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

@Controller
public class MainController {

    @Autowired
    private TodoRepository todoRepository;

    @GetMapping("/todo")
    public String list(Model model, @RequestParam(value = "isActive", required = false) String isActive) {
        if (Objects.isNull(isActive)) {
            model.addAttribute("todos", todoRepository.findAll());
        } else {
            if (isActive.equals("true")) {
                model.addAttribute("todos", todoRepository.findAll().stream()
                        .filter(x -> x.isDone() == false)
                        .collect(Collectors.toList()));
            } else if (isActive.equals("false")) {
                model.addAttribute("todos", todoRepository.findAll().stream()
                        .filter(x -> x.isDone() == true)
                        .collect(Collectors.toList()));
            } else {
                model.addAttribute("todos", todoRepository.findAll());
            }
        }
        return "todolist";
    }

    @GetMapping("/todo/add")
    public String getAddTodo(Model model, @ModelAttribute("todo") Todo todo) {
        return "addTodo";
    }

    @PostMapping("/todo/add")
    public String postAddTodo(Model model, @ModelAttribute("todo") Todo todo) {
        todoRepository.save(todo);
        return "redirect:/todo";
    }

    @GetMapping("/{id}/delete")
    public String removeTodo(@PathVariable long id) {
        todoRepository.delete(todoRepository.getById(id));
        return "redirect:/todo";
    }

    @GetMapping("/{id}/edit")
    public String getEditTodo(@PathVariable long id, Model model) {
        model.addAttribute("todo", todoRepository.getById(id));
        return "editTodo";
    }

    @PostMapping("/{id}/edit")
    public String postEditTodo(@PathVariable long id, Model model, @ModelAttribute("todo") Todo todo) {
        Todo todoToUpdate = todoRepository.findById(id).get();
        todoToUpdate = todo;
        todoRepository.save(todoToUpdate);
        return "redirect:/todo";
    }
}

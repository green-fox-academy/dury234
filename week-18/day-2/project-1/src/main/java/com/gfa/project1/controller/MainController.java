package com.gfa.project1.controller;

import com.gfa.project1.model.Assignee;
import com.gfa.project1.model.Todo;
import com.gfa.project1.repository.AssigneeRepository;
import com.gfa.project1.repository.TodoRepository;
import com.gfa.project1.service.AssigneeService;
import com.gfa.project1.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;
import java.util.stream.Collectors;

@Controller
public class MainController {

    @Autowired
    private TodoRepository todoRepository;

    @Autowired
    private TodoService todoService;

    @Autowired
    private AssigneeService assigneeService;

    @Autowired
    private AssigneeRepository assigneeRepository;

    @GetMapping("/todo")
    public String list(Model model, @RequestParam(value = "isActive", required = false) String isActive) {
        if (Objects.isNull(isActive)) {
            model.addAttribute("todos", todoService.findAll());
        } else {
            if (isActive.equals("true")) {
                model.addAttribute("todos", todoService.findActive());
            } else if (isActive.equals("false")) {
                model.addAttribute("todos", todoService.findInactive());
            } else {
                model.addAttribute("todos", todoService.findAll());
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
        todoService.save(todo);
        return "redirect:/todo";
    }

    @GetMapping("/{id}/delete")
    public String removeTodo(@PathVariable long id) {
        todoService.delete(todoRepository.getById(id));
        return "redirect:/todo";
    }

    @GetMapping("/{id}/edit")
    public String getEditTodo(@PathVariable long id, Model model) {
        model.addAttribute("todo", todoRepository.getById(id));
        model.addAttribute("assignees", assigneeService.findAll());
        return "editTodo";
    }

    @PostMapping("/{id}/edit")
    public String postEditTodo(@PathVariable long id, Model model, @ModelAttribute("todo") Todo todo) {
//        todoService.editTodo(id, todo);
        todoService.updateTodo(id, todo.getTitle(), todo.getDescription(), todo.getDeadline(), todo.isDone(), todo.isUrgent(), todo.getAssignee());
        return "redirect:/todo";
    }

    @PostMapping("/search")
    public String postSearch(Model model, @RequestParam("searchText") String searchText) {
        model.addAttribute("todos", todoService.search(searchText));
        return "todolist";
    }

    @GetMapping("/todo/assignees")
    public String getAssignees(Model model) {
        model.addAttribute("assignees", assigneeService.findAll());
        return "assignees";
    }

    @GetMapping("/{id}/deleteAssignee")
    public String removeAssignee(@PathVariable long id) {
        assigneeService.delete(assigneeRepository.getById(id));
        return "redirect:/todo/assignees";
    }

    @GetMapping("/{id}/editAssignee")
    public String getEditAssignee(@PathVariable long id, Model model) {
        model.addAttribute("assignee", assigneeRepository.getById(id));
        return "editAssignee";
    }

    @PostMapping("/{id}/editAssignee")
    public String postEditAssignee(@PathVariable long id, Model model, @ModelAttribute("assignee") Assignee assignee) {
        Assignee assigneeToUpdate = assigneeRepository.findById(id).get();
        assigneeToUpdate = assignee;
        assigneeService.save(assigneeToUpdate);
        return "redirect:/todo/assignees";
    }

    @GetMapping("/assignee/add")
    public String getAddAssignee(Model model, @ModelAttribute("assignee") Assignee assignee) {
        return "addAssignee";
    }

    @PostMapping("/assignee/add")
    public String postAddAssignee(Model model, @ModelAttribute("assignee") Assignee assignee) {
        assigneeService.save(assignee);
        return "redirect:/todo/assignees";
    }

    @GetMapping("/{id}/profile")
    public String getProfile(Model model, @PathVariable long id) {
        model.addAttribute("assignee", assigneeRepository.getById(id));
        model.addAttribute("todos", todoService.assigneesTodos(assigneeRepository.getById(id)));
        return "profile";
    }
}

package com.gfa.project1;

import com.gfa.project1.model.Assignee;
import com.gfa.project1.model.Todo;
import com.gfa.project1.repository.TodoRepository;
import com.gfa.project1.service.AssigneeService;
import com.gfa.project1.service.TodoService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Project1Application implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Project1Application.class, args);
    }

//    @Autowired
    private final TodoService todoService;
    private final AssigneeService assigneeService;

    public Project1Application(TodoService todoService, AssigneeService assigneeService) {
        this.todoService = todoService;
        this.assigneeService = assigneeService;
    }

    @Override
    public void run(String... args) throws Exception {
        todoService.save(new Todo("Something 1"));
        todoService.save(new Todo("Something 2"));
        todoService.save(new Todo("Something 3"));

        assigneeService.save(new Assignee("Juraj", "juro@email.com"));
        assigneeService.save(new Assignee("Fero", "fero@email.com"));
    }
}

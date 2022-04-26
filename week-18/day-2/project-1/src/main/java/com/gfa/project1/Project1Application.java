package com.gfa.project1;

import com.gfa.project1.model.Todo;
import com.gfa.project1.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Project1Application implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Project1Application.class, args);
    }

//    @Autowired
    private final TodoRepository todoRepository;

    public Project1Application(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        todoRepository.save(new Todo("Something 1"));
//        todoRepository.save(new Todo("Something 2"));
//        todoRepository.save(new Todo("Something 3"));
    }
}

package com.gfa.project1.service;

import com.gfa.project1.model.Assignee;
import com.gfa.project1.model.Todo;
import com.gfa.project1.repository.TodoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class TodoService {

    private final TodoRepository todoRepository;

    public List<Todo> findAll() {
        return todoRepository.findAll();
    }

    public List<Todo> findActive() {
        return todoRepository.findAll().stream()
                .filter(x -> x.isDone() == false)
                .collect(Collectors.toList());
    }

    public List<Todo> findInactive() {
        return todoRepository.findAll().stream()
                .filter(x -> x.isDone() == true)
                .collect(Collectors.toList());
    }

    public void save(Todo todo) {
        todoRepository.save(todo);
    }

    public void delete(Todo todo) {
        todoRepository.delete(todo);
    }

    public List<Todo> search(String string) {
        return todoRepository.findAll().stream()
                .filter(x -> x.getTitle().contains(string))
                .collect(Collectors.toList());
    }

    public List<Todo> assigneesTodos(Assignee assignee) {
        if (todoRepository.findAll().stream()
                .filter(x -> x.getAssignee().getId() == assignee.getId())
                .collect(Collectors.toList()).size() > 0) {
            return todoRepository.findAll().stream().filter(x -> x.getAssignee().getId() == assignee.getId()).collect(Collectors.toList());
        } else {
            return new ArrayList<>();
        }
    }



}

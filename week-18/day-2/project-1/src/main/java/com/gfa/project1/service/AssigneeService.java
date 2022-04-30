package com.gfa.project1.service;

import com.gfa.project1.model.Assignee;
import com.gfa.project1.model.Todo;
import com.gfa.project1.repository.AssigneeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AssigneeService {

    private final AssigneeRepository assigneeRepository;

    public List<Assignee> findAll() {
        return assigneeRepository.findAll();
    }

    public void save(Assignee a) {
        assigneeRepository.save(a);
    }

    public void delete(Assignee a) {
        assigneeRepository.delete(a);
    }
}

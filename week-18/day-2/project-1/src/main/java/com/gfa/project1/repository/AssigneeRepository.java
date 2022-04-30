package com.gfa.project1.repository;

import com.gfa.project1.model.Assignee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface AssigneeRepository extends JpaRepository<Assignee, Long> {
}

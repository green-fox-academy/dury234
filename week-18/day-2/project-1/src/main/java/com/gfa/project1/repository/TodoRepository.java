package com.gfa.project1.repository;

import com.gfa.project1.model.Assignee;
import com.gfa.project1.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

public interface TodoRepository extends JpaRepository<Todo, Long> {
    @Modifying
    @Transactional
    @Query("update Todo t set t.title = ?2, t.description = ?3, t.deadline = ?4, t.done = ?5, t.urgent = ?6, t.assignee = ?7 where t.id = ?1")
    public void updateTodo(long id, String title, String description, LocalDateTime deadline, boolean done, boolean urgent, Assignee assignee);
}

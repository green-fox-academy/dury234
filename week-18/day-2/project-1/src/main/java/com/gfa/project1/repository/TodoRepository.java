package com.gfa.project1.repository;

import com.gfa.project1.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}

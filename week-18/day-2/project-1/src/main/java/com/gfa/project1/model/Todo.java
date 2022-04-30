package com.gfa.project1.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@RequiredArgsConstructor
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String title;
    private boolean urgent = false;
    private boolean done = false;

    @ManyToOne(cascade = CascadeType.PERSIST)
    private Assignee assignee;

    public Todo(String title) {
        this.title = title;
    }

    public Todo(String title, boolean urgent, boolean done, Assignee assignee) {
        this.title = title;
        this.urgent = urgent;
        this.done = done;
        this.assignee = assignee;
    }
}

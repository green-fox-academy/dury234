package com.gfa.project1.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;

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

    private String description;

    @CreationTimestamp
    private LocalDateTime created;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDateTime deadline;

    public Todo(String title) {
        this.title = title;
    }

//    public Todo(String title, boolean urgent, boolean done, Assignee assignee) {
//        this.title = title;
//        this.urgent = urgent;
//        this.done = done;
//        this.assignee = assignee;
//    }

    public Todo(String title, boolean urgent, boolean done, Assignee assignee, String description, LocalDateTime deadline) {
        this.title = title;
        this.urgent = urgent;
        this.done = done;
        this.assignee = assignee;
        this.description = description;
        this.deadline = deadline;
    }
}

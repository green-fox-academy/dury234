package com.greenfoxacademy.printable;

public class TodoItem {
    String task;
    Priority priority;
    Boolean done;

    public TodoItem (String task) {
        this.task = task;
        priority = Priority.MEDIUM;
        done = false;
    }

    public TodoItem (String task, Priority p) {
        this.task = task;
        priority = p;
        done = false;
    }

    public void finishTask() {
        done = true;
    }
}

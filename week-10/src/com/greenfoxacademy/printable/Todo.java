package com.greenfoxacademy.printable;

import java.util.ArrayList;
import java.util.List;

public class Todo implements Printable {
    List<TodoItem> todoList;

    public Todo() {
        todoList = new ArrayList<>();
    }

    public void add(TodoItem item) {
        todoList.add(item);
    }


    @Override
    public void printAllFields() {
        for (TodoItem todoItem : todoList) {
            System.out.println("Task: " + todoItem.task + " |  Priority: " + todoItem.priority + " | Done: " + todoItem.done);
        }
    }
}

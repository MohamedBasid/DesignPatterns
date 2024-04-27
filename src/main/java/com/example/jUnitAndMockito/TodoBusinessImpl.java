package com.example.jUnitAndMockito;

import java.util.List;

public class TodoBusinessImpl {
    TodoService todoService;

    TodoBusinessImpl(TodoService todoService) {
        this.todoService = todoService;
    }

    public String getFirstTodo(String user){
        List<String> todoList = todoService.getTodoList(user);
        if(todoList.size() > 0) {
            return todoList.get(0);
        }
        else {
            return "No Todo activity";
        }
    }

}

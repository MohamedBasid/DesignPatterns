package com.example.jUnitAndMockito;

import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.Test;
import org.mockito.stubbing.Answer;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TodoBusinessImplTest {
    TodoService todoService = mock(TodoService.class);
    @Test
    public void test(){
        List<String> list = new ArrayList<>();
        list.add("Wake up");
        list.add("Fajr salah");
        list.add("Excercise");
        list.add("Studying");

        TodoBusinessImpl todoBusiness = new TodoBusinessImpl(todoService);
        when(todoService.getTodoList("Basid")).thenReturn(list);

        assertEquals("Wake up", todoBusiness.getFirstTodo("Basid"));
    }
}

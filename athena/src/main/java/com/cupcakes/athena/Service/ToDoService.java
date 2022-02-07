package com.cupcakes.athena.Service;
import com.cupcakes.athena.Model.ToDo;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ToDoService {

    private static List<ToDo> todos = new ArrayList<>();
    private static int idCounter = 0;

    static {
        todos.add(new ToDo(++idCounter, "tosin","Learn to Dance 2"));
        todos.add(new ToDo(++idCounter, "tosin","Learn about Microservices 2"));
        todos.add(new ToDo(++idCounter, "tosin","Learn about Angular"));
    }

    public List<ToDo> findAll() {
        return todos;
    }

    public ToDo deleteById(long id) {
        ToDo todo = findById(id);
        if(todo == null) return null;

        if(todos.remove(todo)) {
            return todo;
        }

        return null;
    }

    public ToDo findById(long id) {
        for(ToDo todo: todos){
            if(todo.getId() == id){
                return todo;
            }
        }
        return null;
    }
}

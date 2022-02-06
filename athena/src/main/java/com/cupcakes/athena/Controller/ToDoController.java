package com.cupcakes.athena.Controller;

import com.cupcakes.athena.Model.ToDo;
import com.cupcakes.athena.Service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.*;

public class ToDoController {
    @Autowired
    private ToDoService todoService;

    @GetMapping("/users/{userName}/todos")
    public List<ToDo> getAllTodos(@PathVariable String username){
        return todoService.findAll();
    }
}

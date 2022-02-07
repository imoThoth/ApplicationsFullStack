package com.cupcakes.athena.Controller;

import com.cupcakes.athena.Model.HelloWorldBean;
import com.cupcakes.athena.Model.ToDo;
import com.cupcakes.athena.Service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping()
@CrossOrigin(origins = "*")
@RestController
public class ServerController {

    @Autowired
    private ToDoService todoService;

    @GetMapping(path = "/user")
    public String helloWorld(){
        return "Hello To The New User";
    }

    ///hello-world/path-variable/in28minutes
    @GetMapping(path = "/hello-world/path-variable/{name}")
    public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
        return new HelloWorldBean(String.format("Hello World, %s", name));
    }

    @GetMapping("{userName}/todos/")
    public ToDo getATodo(@PathVariable("userName") String userName,
                               @PathVariable("id") long id ){

        return todoService.findById(id);
    }

    @GetMapping("{userName}/todos/")
    public List<ToDo> getAllTodos(@PathVariable("userName") String userName){
        return todoService.findAll();
    }

    @DeleteMapping("/{userName}/todos/{id}")
    public ResponseEntity<Void> deleteTodo(@PathVariable("userName") String userName,
                                           @PathVariable("id") long id ){
       ToDo todo = todoService.deleteById(id);
        if(todo !=null){
            return  ResponseEntity.noContent().build();
        }
            return ResponseEntity.notFound().build();
    }


}

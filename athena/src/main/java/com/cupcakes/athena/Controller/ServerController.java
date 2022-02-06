package com.cupcakes.athena.Controller;

import com.cupcakes.athena.Model.HelloWorldBean;
import org.springframework.web.bind.annotation.*;

@RequestMapping()
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class ServerController {

    @GetMapping(path = "/user")
    public String helloWorld(){
        return "Hello To The New User";
    }

    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean helloWorldBean() {
        return new HelloWorldBean("Hello World");
    }

    ///hello-world/path-variable/in28minutes
    @GetMapping(path = "/hello-world/path-variable/{name}")
    public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
        return new HelloWorldBean(String.format("Hello World, %s", name));
    }
}

package com.cupcakes.athena.Controller;

import org.springframework.web.bind.annotation.*;

@RequestMapping(path = "database")
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class ServerController {

    @GetMapping(path = "/user")
    public String helloWorld(){
        return "Hello To The New User";
    }
}

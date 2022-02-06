package com.cupcakes.athena.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping(path = "database")
@CrossOrigin
@ResponseBody
public class ServerController {

    @GetMapping(path = "/user")
    public String helloWorld(){
        return "Hello To The New User";
    }
}

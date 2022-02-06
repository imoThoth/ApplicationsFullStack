package com.cupcakes.athena.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/")
@CrossOrigin
@ResponseBody
public class ServerController {

    @GetMapping()
    public String helloWorld(){
        return "Hello To The New User";
    }
}

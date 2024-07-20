package com.org.spring_jwt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {
    @GetMapping("/")
    public String welcome(){
        return "Welcome!!";
    }
    @GetMapping("/admin/hello")
    public String helloAdmin(){
        return "Hello from admin route!!";
    }
}

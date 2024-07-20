package com.org.spring_jwt.controller;

import com.org.spring_jwt.model.User;
import com.org.spring_jwt.service.AdminViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class AdminViewController {
    @Autowired
    private AdminViewService service;

    @GetMapping("/admin/getAllUsers")
    public List<User> getAllUsers(){
        return service.getAllUsers();
    }
}

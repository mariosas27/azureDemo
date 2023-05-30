package com.example.azureDemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @RequestMapping("/api/alumno")
    public String getUsuario(){
        return "User 1";
    }
}

package com.example.project24112022.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controller1 {

    @GetMapping("/sachin")
    public String getMethod1(){
        return  "Hi sachin";
    }
}

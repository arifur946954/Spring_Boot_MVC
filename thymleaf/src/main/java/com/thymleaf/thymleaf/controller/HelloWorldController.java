package com.thymleaf.thymleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
    @RequestMapping("/showForm")
    public String ShowForm(){
        return "HelloWorld-Form";
    }

    @RequestMapping("/processForm")
    public String processForm(){
        return "HelloWorld";
    }
}

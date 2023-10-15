package com.thymleaf.thymleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
    @GetMapping("/hello")
    public String Hello(Model theModel){
        theModel.addAttribute("theDate",new java.util.Date());
        return "HelloWorld";
    }
}

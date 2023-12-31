package com.thymleaf.thymleaf.controller;

import com.thymleaf.thymleaf.model.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class StudentController {
    @Value("${countries}")
    private List<String> countries;
    @Value("${languages}")
    private List<String> languages;

    @Value("${operationgsystem}")
    private List<String> operationgsystem;
    //
    @GetMapping("/showStudentForm")
    public  String showForm(Model theModel){
        //create a student object
        Student theStudent=new Student();
        //add student obj in the model
        theModel.addAttribute("student",theStudent);
        theModel.addAttribute("countries",countries);
        theModel.addAttribute("languages",languages);
        theModel.addAttribute("operationgsystem",operationgsystem);

        return "student-form";

    }

    @PostMapping("/processStudentForm")
    public String processForm(@ModelAttribute("student") Student theStudent){
        System.out.println("first name is:"+theStudent.getFirstName()
                +"Last Name: "+theStudent.getLastName()+" Email is: "+theStudent.getEmail());
        return "student-confirmation";

    }
}

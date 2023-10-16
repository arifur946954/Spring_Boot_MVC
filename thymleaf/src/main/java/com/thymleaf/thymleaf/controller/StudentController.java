package com.thymleaf.thymleaf.controller;

import com.thymleaf.thymleaf.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
@Controller
public class StudentController {
    //
    @GetMapping("/showStudentForm")
    public  String showForm(Model theModel){
        //create a student object
        Student theStudent=new Student();
        //add student obj in the model
        theModel.addAttribute("student" ,theStudent);
        return "student-form";

    }

    @PostMapping("/processStudentForm")
    public String processForm(@ModelAttribute("student") Student theStudent){
        System.out.println("first name is:"+theStudent.getFirstName()
                +"Last Name: "+theStudent.getLastName()+" Email is: "+theStudent.getEmail());
        return "student-confirmation";

    }
}

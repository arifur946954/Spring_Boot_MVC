package com.thymleaf.thymleaf.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
    @GetMapping("/showForm")
    public String ShowForm(){
        return "HelloWorld-Form";
    }

//    @RequestMapping("/processForm")
//    public String processForm(){
//        return "HelloWorld";
//    }

    //need a controller read form data
    //add data to the model

    @GetMapping("/processFormVeTwo")
    public String letShoutDoude(HttpServletRequest request, Model model){

        //read the request from html form
      String theStudent=  request.getParameter("studentName");
        //convert the data to all caps
        theStudent=theStudent.toUpperCase();
        //create the message
        String result="Yo!"+theStudent;
        //add the message to model
        model.addAttribute("message",result);
        return "HelloWorld";

    }


    @GetMapping("/processFormVeThree")
    public String processFormVeThree(
            @RequestParam("studentName") String theName,
             @RequestParam("studentEmail") String theEmail,
             @RequestParam("studentMobile") String theMobile
            , Model model){

        //read the request from html form
        //String theStudent=  request.getParameter("studentName");
        //convert the data to all caps
          theName=theName.toUpperCase();
        theEmail=theEmail.toUpperCase();
        theMobile=theMobile.toUpperCase();
        //create the message
        String result="Yo!"+theName;
        String result1="Yo!"+theEmail;
        String result2="Yo!"+theMobile;
        //add the message to model
        model.addAttribute("message",result);
        model.addAttribute("message1",result1);
        model.addAttribute("message2",result2);
        return "HelloWorld";

    }
}

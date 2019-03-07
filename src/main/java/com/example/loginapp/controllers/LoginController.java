package com.example.loginapp.controllers;

import com.example.loginapp.models.forms.UserForm;
import com.example.loginapp.models.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

    @Autowired
    UserService userService;

    @GetMapping("loginform")
    public String loginForm(Model model){
        model.addAttribute("user", new UserForm());
        return "loginform";
    }
    @PostMapping("loginform")
    @ResponseBody
    public String login(@ModelAttribute UserForm userForm){

        if(userService.login(userForm)){
            return "Login success";
        } else return "Login failed";

    }









}

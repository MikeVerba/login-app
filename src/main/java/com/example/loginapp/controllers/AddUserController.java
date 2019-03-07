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
public class AddUserController {

    @Autowired
    UserService userService;

    @GetMapping("adduserform")
    public String addUserForm(Model model){
        model.addAttribute("user", new UserForm());
        return "adduserform";
    }
    @ResponseBody
    @PostMapping("adduserform")
    public String saveUser(@ModelAttribute UserForm userForm){

        if(userService.saveUserForm(userForm)) {
            return "Thank you";
        } else return "Username is busy. Try another one";
    }

}

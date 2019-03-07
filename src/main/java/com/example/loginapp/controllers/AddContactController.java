package com.example.loginapp.controllers;

import com.example.loginapp.models.forms.ContactForm;
import com.example.loginapp.models.services.ContactService;
import com.example.loginapp.models.services.UserSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AddContactController {

    @Autowired
    ContactService contactService;

    @Autowired UserSession userSession;


    @GetMapping("addcontactform")
    public String addContact(Model model){

        model.addAttribute("contact",new ContactForm());

        return "addcontactform";
    }

    @ResponseBody
    @PostMapping("addcontactform")
    public String saveContact(@ModelAttribute ContactForm contactForm){


        if(contactService.saveContactForm(contactForm)){
            return "Contact saved!";
        }
        else return "Operation failed!";
    }
}

package com.example.loginapp.controllers;

import com.example.loginapp.models.forms.NoteForm;
import com.example.loginapp.models.services.NoteService;
import com.example.loginapp.models.services.UserSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AddNoteController {

    @Autowired
    UserSession userSession;

    @Autowired
    NoteService noteService;

    @GetMapping("addnoteform")
    public String addNote(Model model){

        model.addAttribute("note", new NoteForm());

        return "addnoteform";
    }

    @PostMapping("addnoteform")
    @ResponseBody
    public String saveNote(@ModelAttribute NoteForm noteForm){

        if(noteService.saveNoteForm(noteForm)){
            return "Note saved!";
        } else return "Operation failed!";
    }
}

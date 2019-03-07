package com.example.loginapp.models.services;

import com.example.loginapp.models.forms.NoteForm;
import com.example.loginapp.models.mappers.NoteFormToNoteEntityMapper;
import com.example.loginapp.models.repositories.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class NoteService {

    @Autowired
    NoteRepository noteRepository;

    @Autowired
    UserSession userSession;


    public boolean saveNoteForm(NoteForm noteForm){

        noteForm.setUserId(userSession.getUserEntity().getId());
        noteForm.setInsertionDate(LocalDateTime.now());

        noteRepository.save(new NoteFormToNoteEntityMapper().map(noteForm));
        return true;

    }


}

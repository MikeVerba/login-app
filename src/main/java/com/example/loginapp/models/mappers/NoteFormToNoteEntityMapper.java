package com.example.loginapp.models.mappers;


import com.example.loginapp.models.entities.NoteEntity;
import com.example.loginapp.models.forms.NoteForm;
import org.springframework.stereotype.Service;

@Service
public class NoteFormToNoteEntityMapper implements Mapper<NoteForm, NoteEntity> {
    @Override
    public NoteEntity map(NoteForm key) {
        NoteEntity noteEntity = new NoteEntity();
        noteEntity.setTitle(key.getTitle());
        noteEntity.setUserId(key.getUserId());
        noteEntity.setInsertionDate(key.getInsertionDate());
        noteEntity.setContent(key.getContent());
        return noteEntity;
    }
}

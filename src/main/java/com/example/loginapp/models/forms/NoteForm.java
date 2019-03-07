package com.example.loginapp.models.forms;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.Objects;

@Data
public class NoteForm {
    private Long id;
    private Long userId;
    private String title;
    private LocalDateTime insertionDate;
    private String content;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NoteForm noteForm = (NoteForm) o;
        return Objects.equals(id, noteForm.id) &&
                Objects.equals(userId, noteForm.userId) &&
                Objects.equals(title, noteForm.title) &&
                Objects.equals(insertionDate, noteForm.insertionDate) &&
                Objects.equals(content, noteForm.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userId, title, insertionDate, content);
    }
}

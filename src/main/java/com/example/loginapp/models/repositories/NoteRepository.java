package com.example.loginapp.models.repositories;

import com.example.loginapp.models.entities.NoteEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteRepository extends CrudRepository<NoteEntity, Long> {
}

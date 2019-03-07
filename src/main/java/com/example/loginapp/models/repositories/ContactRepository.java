package com.example.loginapp.models.repositories;

import com.example.loginapp.models.entities.ContactEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends CrudRepository<ContactEntity,Long> {
}

package com.example.loginapp.models.mappers;

import com.example.loginapp.models.entities.ContactEntity;
import com.example.loginapp.models.forms.ContactForm;
import org.springframework.stereotype.Service;

@Service
public class ContactFormToContactEntityMapper implements Mapper<ContactForm, ContactEntity> {
    @Override
    public ContactEntity map(ContactForm key) {

        ContactEntity contactEntity = new ContactEntity();
        contactEntity.setUserId(key.getUserId());
        contactEntity.setName(key.getName());
        contactEntity.setLastName(key.getLastName());
        contactEntity.setEmail(key.getEmail());
        contactEntity.setPhoneNumber(key.getPhoneNumber());
        contactEntity.setInsertionDate(key.getInsertionDate());

        return contactEntity;
    }
}

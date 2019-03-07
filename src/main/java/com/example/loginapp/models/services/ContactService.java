package com.example.loginapp.models.services;

import com.example.loginapp.models.forms.ContactForm;
import com.example.loginapp.models.mappers.ContactFormToContactEntityMapper;
import com.example.loginapp.models.repositories.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class ContactService {

    @Autowired
    UserSession userSession;

    @Autowired
    ContactRepository contactRepository;

    public boolean saveContactForm(ContactForm contactForm){
        System.out.println(LocalDateTime.now());

        contactForm.setUserId(userSession.getUserEntity().getId());
        contactForm.setInsertionDate(LocalDateTime.now());
        contactRepository.save(new ContactFormToContactEntityMapper().map(contactForm));
        return true;
    }

//    public boolean addContactForm(ContactForm contactForm, Long userId) {
//
//        contactForm.setInsertionDate(LocalDateTime.now());
//        contactForm.setUserId(userId);
//        contactRepository.save(new ContactFormToContactEntityMapper().map(contactForm));
//
//        return true;
//
//    }
}

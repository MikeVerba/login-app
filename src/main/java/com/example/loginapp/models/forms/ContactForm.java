package com.example.loginapp.models.forms;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.Objects;

@Data
public class ContactForm {

    private Long id;
    private Long userId;
    private String name;
    private String lastName;
    private String email;
    private String phoneNumber;
    private LocalDateTime insertionDate;

    public ContactForm() {
    }

    public ContactForm(Long id, Long userId, String name, String lastName, String email, String phoneNumber, LocalDateTime insertionDate) {
        this.id = id;
        this.userId = userId;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.insertionDate = insertionDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContactForm that = (ContactForm) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(userId, that.userId) &&
                Objects.equals(name, that.name) &&
                Objects.equals(lastName, that.lastName) &&
                Objects.equals(email, that.email) &&
                Objects.equals(phoneNumber, that.phoneNumber) &&
                Objects.equals(insertionDate, that.insertionDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userId, name, lastName, email, phoneNumber, insertionDate);
    }

}

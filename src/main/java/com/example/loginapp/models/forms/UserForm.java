package com.example.loginapp.models.forms;

import lombok.Data;

import java.util.Objects;

@Data
public class UserForm {
    private Long id;
    private String name;
    private String lastname;
    private String email;
    private String password;

    public UserForm() {
    }

    public UserForm(Long id, String name, String surname, String email, String password) {
        this.id = id;
        this.name = name;
        this.lastname = surname;
        this.email = email;
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserForm userForm = (UserForm) o;
        return Objects.equals(id, userForm.id) &&
                Objects.equals(name, userForm.name) &&
                Objects.equals(lastname, userForm.lastname) &&
                Objects.equals(email, userForm.email) &&
                Objects.equals(password, userForm.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, lastname, email, password);
    }

}

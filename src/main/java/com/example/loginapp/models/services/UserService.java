package com.example.loginapp.models.services;

import com.example.loginapp.models.entities.UserEntity;
import com.example.loginapp.models.forms.UserForm;
import com.example.loginapp.models.mappers.UserFormToUserEntityMapper;
import com.example.loginapp.models.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    UserSession userSession;


    public boolean saveUserForm(UserForm userForm) {

        if(!userRepository.existsByEmail(userForm.getEmail())) {

            userRepository.save(new UserFormToUserEntityMapper().map(userForm));
            return true;
        }
        else return false;
    }

    public boolean login(UserForm userForm) {

        Optional<UserEntity> userWhoTriesToLogin = userRepository.getByEmail(userForm.getEmail());


        if(userWhoTriesToLogin.isPresent() && userForm.getPassword().equals(userWhoTriesToLogin.get().getPassword())){

            userSession.setLogin(true);
            userSession.setUserEntity(userWhoTriesToLogin.get());
            return true;
        }
        return false;


    }


}

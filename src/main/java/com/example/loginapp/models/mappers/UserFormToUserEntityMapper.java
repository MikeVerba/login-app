package com.example.loginapp.models.mappers;

import com.example.loginapp.models.entities.UserEntity;
import com.example.loginapp.models.forms.UserForm;
import org.springframework.stereotype.Service;


@Service
public class UserFormToUserEntityMapper implements Mapper<UserForm, UserEntity> {
    @Override
    public UserEntity map(UserForm key) {
        UserEntity userEntity = new UserEntity();
        userEntity.setName(key.getName());
        userEntity.setLastname(key.getLastname());
        userEntity.setEmail(key.getEmail());
        userEntity.setPassword(key.getPassword());
        return userEntity;
    }
}

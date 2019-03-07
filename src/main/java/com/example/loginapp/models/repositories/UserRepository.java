package com.example.loginapp.models.repositories;

import com.example.loginapp.models.entities.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<UserEntity,Long> {

    boolean existsByEmail(String email);
    boolean existsByEmailAndPassword(String email,String password);
    Optional<UserEntity>getByEmail(String email);

}

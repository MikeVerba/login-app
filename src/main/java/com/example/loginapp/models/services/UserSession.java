package com.example.loginapp.models.services;

import com.example.loginapp.models.entities.UserEntity;
import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;

@Service
@Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS )
@Data
public class UserSession {
    private boolean isLogin;
    private UserEntity userEntity;

}

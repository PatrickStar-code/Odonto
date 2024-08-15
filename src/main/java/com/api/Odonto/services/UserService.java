package com.api.Odonto.services;

import java.util.List;

import com.api.Odonto.model.User;
import com.api.Odonto.request.LoginRequest;

public interface UserService {

    User save(User user);

    User findById(Long id);

    User findByLogin(String Login);

    User login(LoginRequest login);

    void deleteById(Long id);

    User update(Long id, User user);

    List<User> findAll();
    
}
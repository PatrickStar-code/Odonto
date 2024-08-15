package com.api.Odonto.services;

import com.api.Odonto.model.User;

public interface UserService {

    User save(User user);

    User findById(Long id);

    User findByEmailAndPassword(String email, String password);

    void deleteById(Long id);

    void update(Long id, User user);
    
}
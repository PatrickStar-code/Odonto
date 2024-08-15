package com.api.Odonto.services.impl;

import com.api.Odonto.model.User;
import com.api.Odonto.repository.UserRepository;
import com.api.Odonto.services.UserService;

public class UserImpl implements UserService{
    UserRepository UserRepository;

    @Override
    public User save(User user) {
        return UserRepository.save(user);
    }

    @Override
    public User findById(Long id) {
        return UserRepository.findById(id).get();
    }

    @Override
    public User findByEmailAndPassword(String email, String password) {
        return UserRepository.findByEmailAndPassword(email, password);
    }

    @Override
    public void deleteById(Long id) {
        UserRepository.deleteById(id);
    }

    @Override
    public void update(Long id, User user) {
        User oldUser = UserRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
        oldUser.setEmail(user.getEmail());
        oldUser.setPassword(user.getPassword());
        UserRepository.save(oldUser);

    }
    
}

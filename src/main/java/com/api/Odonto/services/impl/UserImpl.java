package com.api.Odonto.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.api.Odonto.model.User;
import com.api.Odonto.repository.UserRepository;
import com.api.Odonto.request.LoginRequest;
import com.api.Odonto.services.UserService;

@Service
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
    public void deleteById(Long id) {
        UserRepository.deleteById(id);
    }

    @Override
    public User update(Long id, User user) {
        User oldUser = UserRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
        oldUser.setLogin(user.getLogin());
        oldUser.setPassword(user.getPassword());
        return UserRepository.save(oldUser);
    }

    @Override
    public List<User> findAll() {
        return UserRepository.findAll();
        
    }

    @Override
    public User findByLogin(String Login) {
        return UserRepository.findByLogin(Login);
    }


    public User login(LoginRequest loginRequest) {
        // Busca o usuário pelo login
        User user = UserRepository.findByLogin(loginRequest.getLogin());

        // Verifica se o usuário existe e se a senha está correta
        if (user != null && user.getPassword().equals(loginRequest.getPassword())) {
            return user;
        } else {
            // Retorna null se as credenciais forem inválidas
            return null;
        }
    }


}

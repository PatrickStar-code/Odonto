package com.api.Odonto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.Odonto.model.User;
import com.api.Odonto.request.LoginRequest;

@Repository
public interface  UserRepository extends JpaRepository<User, Long> {


    User findByLogin(String Login);

    
    
}

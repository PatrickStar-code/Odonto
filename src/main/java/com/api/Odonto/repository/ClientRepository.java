package com.api.Odonto.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.Odonto.model.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

    Client findByCpf(String cpf);

    Client findByEmail(String email);
    
}
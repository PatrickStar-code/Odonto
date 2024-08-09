package com.api.Odonto.services;

import java.util.List;

import com.api.Odonto.model.Client;


public interface ClientService {

    public List<Client> findAll();

    public Client findById(Long id);

    public Client createClient(Client client);

    public void deleteById(Long id);

    public Client update(Long id,Client client);

    public Client findByEmail(String email);

    public Client findByCpf(String cpf);

} 


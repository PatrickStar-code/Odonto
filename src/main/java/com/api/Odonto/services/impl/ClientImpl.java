package com.api.Odonto.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.Odonto.model.Client;
import com.api.Odonto.repository.ClientRepository;
import com.api.Odonto.services.ClientService;
@Service
public class ClientImpl implements ClientService {

    @Autowired
    private  ClientRepository clientRepository;

    
    @Override
    public List<Client> findAll() {
        return clientRepository.findAll();
    }


    @Override
    public Client findById(Long id) {
        return clientRepository.findById(id).get();
    }


    @Override
    public Client createClient(Client client) {
        return clientRepository.save(client);
    }


    @Override
    public void deleteById(Long id) {
        clientRepository.deleteById(id);
    }


    @Override
    public Client update(Long id,Client client) {
       Client oldClient = clientRepository.findById(id).orElseThrow(() -> new RuntimeException("Client not found"));

       oldClient.setName(client.getName());
       oldClient.setCpf(client.getCpf());
       oldClient.setEmail(client.getEmail());
       oldClient.setPhone(client.getPhone());

       return clientRepository.save(oldClient);
    }


    @Override
    public Client findByEmail(String email) {
        return clientRepository.findByEmail(email);
    }


    @Override
    public Client findByCpf(String cpf) {
        return clientRepository.findByCpf(cpf);
    }


}
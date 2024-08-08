package com.api.Odonto.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.api.Odonto.model.Client;
import com.api.Odonto.repository.ClientRepository;
import com.api.Odonto.services.ClientService;
@Service
public class ClientImpl implements ClientService {
    private  ClientRepository clientRepository;

    
    @Override
    public List<Client> findAll() {
        return clientRepository.findAll();
    }


}
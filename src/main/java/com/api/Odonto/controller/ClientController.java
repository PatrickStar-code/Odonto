package com.api.Odonto.controller;

import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.api.Odonto.services.ClientService;

import io.swagger.v3.oas.annotations.Operation;

import com.api.Odonto.model.Client;


@Controller
@RequestMapping("/client")
public class ClientController {
    private ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }
    
    
    @GetMapping("/")
    @Operation(summary = "Find all clients")
    public ResponseEntity<List<Client>> findAll() {
        List<Client> clients = clientService.findAll();
        return ResponseEntity.ok(clients);
    }
    
}

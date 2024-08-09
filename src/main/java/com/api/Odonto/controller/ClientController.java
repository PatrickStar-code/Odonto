package com.api.Odonto.controller;

import java.net.URI;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.api.Odonto.services.ClientService;

import io.swagger.v3.oas.annotations.Operation;

import com.api.Odonto.model.Client;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;





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

    @GetMapping("/{id}")
    @Operation(summary = "Find client by id")
    public ResponseEntity<Client> findById(@RequestParam Long id) {
        Client client = clientService.findById(id);
        return ResponseEntity.ok(client);
    }
    
    @GetMapping("/{email}")
    @Operation(summary = "Find client by email")
    public ResponseEntity<Client> findByEmail(@RequestParam String email) {
        Client client = clientService.findByEmail(email);
        return ResponseEntity.ok(client);
    }

    @PostMapping
    @Operation(summary = "Create client")
    public ResponseEntity<Client> createClient(@RequestBody Client client) {
        Client createdClient = clientService.createClient(client);
        ServletUriComponentsBuilder.fromCurrentRequest();
        URI location =  ServletUriComponentsBuilder.fromCurrentRequest()
                        .path("/{id}")
                        .buildAndExpand(createdClient.getId())
                        .toUri();
        return ResponseEntity.created(location).body(createdClient);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Update client")
    public ResponseEntity<Client> update(@PathVariable Long id, @RequestBody Client client) {
        Client updatedClient = clientService.update(id, client);
        if(findById(id) == null) {
            return ResponseEntity.notFound().build();
        }
        else {
            URI location =  ServletUriComponentsBuilder.fromCurrentRequest()
                    .path("{id}")
                    .buildAndExpand(updatedClient.getId())
                    .toUri();
            return ResponseEntity.created(location).body(updatedClient);
        }
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete client by id")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        if(findById(id) == null) {
            return ResponseEntity.notFound().build();
        }else{
            clientService.deleteById(id);
        return ResponseEntity.noContent().build();
        }
        
    }
    
    
}

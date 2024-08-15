package com.api.Odonto.controller;

import java.net.URI;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.api.Odonto.model.User;
import com.api.Odonto.request.LoginRequest;
import com.api.Odonto.services.UserService;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@Controller
@RequestMapping("/user")
public class UserController{
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    @Operation(summary = "Find all users")
    public ResponseEntity<List<User>> findAll() {
        List<User> users = userService.findAll();
        return ResponseEntity.ok(users);
    }

    @GetMapping("/{id}")
    @Operation(summary = "Find user by id")
    public ResponseEntity<User> findById(@PathVariable Long id) {
        User user = userService.findById(id);
        return ResponseEntity.ok(user);
    }

    @PostMapping
    @Operation(summary = "Save user")
    public ResponseEntity<User> save(@RequestBody User user) {
        user = userService.save(user);
           ServletUriComponentsBuilder.fromCurrentRequest();
        URI location =  ServletUriComponentsBuilder.fromCurrentRequest()
                        .path("/")
                        .buildAndExpand(user.getId())
                        .toUri();

        return ResponseEntity.created(location).body(user);    
    }

    @PostMapping("/login")
    @Operation(summary = "Login user")
    public ResponseEntity<User> login(@RequestBody LoginRequest login) {
        User user = userService.login(login);

        if (user == null) {
            return ResponseEntity.notFound().build();
        }
    
        return ResponseEntity.ok(user);
    }
    

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete user by id")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        if(userService.findById(id) == null) {
            return ResponseEntity.notFound().build();
        }

        userService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
    

    @PutMapping("/{id}")
    @Operation(summary = "Update user")
    public ResponseEntity<User> update(@PathVariable Long id, @RequestBody User user) {
         User update = userService.update(id, user);
         URI location =  ServletUriComponentsBuilder.fromCurrentRequest()
                        .path("/{id}")
                        .buildAndExpand(update.getId())
                        .toUri();
        return ResponseEntity.created(location).body(update);
    }
}

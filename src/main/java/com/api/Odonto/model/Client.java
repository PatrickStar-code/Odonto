package com.api.Odonto.model;

import jakarta.persistence.*;
@Entity
@Table(name = "tb_clientes")
public class Client extends Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    //Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    
}

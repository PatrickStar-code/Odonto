package com.api.Odonto.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Usuarios")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "login", unique = true)
    private String login;

    @Column(name = "senha")
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo")
    private UserType type;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Client client;

    @ManyToOne
    @JoinColumn(name = "dentista_id")
    private Dentist dentist;
    
    //Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserType getType() {
        return type;
    }

    public void setType(UserType type) {
        this.type = type;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Dentist getDentist() {
        return dentist;
    }

    public void setDentist(Dentist dentist) {
        this.dentist = dentist;
    }

    //Getters and Setters
    
}


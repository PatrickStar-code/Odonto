package com.api.Odonto.model;

import java.util.Date;

import jakarta.persistence.*;
import jakarta.persistence.MappedSuperclass;
import jakarta.validation.constraints.NotNull;

@MappedSuperclass
public class Person {

    @Column(name = "nome", length = 100)
    @NotNull
    private String name;

    @Column(name = "email", length = 100)
    @NotNull
    private String email;

    @Column(name = "Telefone", length = 20)
    @NotNull
    private String phone;

    @Column(name = "data_nascimento")
    @Temporal(TemporalType.DATE)
    @NotNull
    private Date birthDate;

    @Column(name = "cpf", length = 14)
    @NotNull
    private String cpf;

    //Getters and Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public Date getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    
}

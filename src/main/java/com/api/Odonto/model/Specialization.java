package com.api.Odonto.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.Set;

@Entity
@Table(name = "tb_especializacoes")
public class Specialization {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "descricao")
    @NotNull
    private String description;

    @ManyToMany(mappedBy = "specializations")
    private Set<Dentist> dentists;
    
    //Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Dentist> getDentists() {
        return dentists;
    }

    public void setDentists(Set<Dentist> dentists) {
        this.dentists = dentists;
    }

    // Getters and Setters
    
}

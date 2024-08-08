package com.api.Odonto.model;


import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "tb_dentistas")
public class Dentist extends Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @ManyToMany
    @JoinTable(name = "tb_dentista_especializacoes", joinColumns = @JoinColumn(name = "dentista_id"), inverseJoinColumns = @JoinColumn(name = "especializacao_id"))
    private Set<Specialization> specializations;

    //Getters and Setters
    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public Set<Specialization> getSpecializations() {
        return specializations;
    }


    public void setSpecializations(Set<Specialization> specializations) {
        this.specializations = specializations;
    }

    
}

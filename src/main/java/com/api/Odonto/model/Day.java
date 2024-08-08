package com.api.Odonto.model;

import java.util.Set;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_dias")
public class Day {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private DaysEnum day;

    @OneToMany(mappedBy = "day")
    private Set<Schedule> agendas;
    
    
    //Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public DaysEnum getDay() {
        return day;
    }

    public void setDay(DaysEnum day) {
        this.day = day;
    }

    public Set<Schedule> getAgendas() {
        return agendas;
    }

    public void setAgendas(Set<Schedule> agendas) {
        this.agendas = agendas;
    }
    
    //Getters and Setters
    


}

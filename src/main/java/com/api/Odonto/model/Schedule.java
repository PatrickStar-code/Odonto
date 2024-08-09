package com.api.Odonto.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_agenda")
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "horario")
    @Temporal(TemporalType.TIME)
    private String hour;

    @Column(name = "disponivel", nullable = false, columnDefinition = "boolean default true",length = 1)
    private Boolean available;

    @ManyToOne
    @JoinColumn(name = "tb_dias_id")
    private Day day;
    
    //Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public Day getDay() {
        return day;
    }

    public void setDay(Day day) {
        this.day = day;
    }

    
}

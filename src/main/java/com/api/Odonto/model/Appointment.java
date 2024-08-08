package com.api.Odonto.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tb_agendamentos")
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Client client;

    @ManyToOne
    @JoinColumn(name = "dentista_id")
    private Dentist dentist;

    @ManyToOne
    @JoinColumn(name = "agenda_id")
    private Schedule agenda;

    private Date appointmentDate;
    private String appointmentHour;
    private String status;

    //Getters and Setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
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
    public Schedule getAgenda() {
        return agenda;
    }
    public void setAgenda(Schedule agenda) {
        this.agenda = agenda;
    }
    public Date getAppointmentDate() {
        return appointmentDate;
    }
    public void setAppointmentDate(Date appointmentDate) {
        this.appointmentDate = appointmentDate;
    }
    public String getAppointmentHour() {
        return appointmentHour;
    }
    public void setAppointmentHour(String appointmentHour) {
        this.appointmentHour = appointmentHour;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    // Getters and Setters
    
}

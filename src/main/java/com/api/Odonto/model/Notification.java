package com.api.Odonto.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Notificacoes")
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private User user;

    @Column(name = "mensagem")
    private String message;

    @Column(name = "lida", nullable = false, columnDefinition = "boolean default false",length = 1)
    private Boolean read;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "data_hora")
    private Date timestamp;

    //Getters and Setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public Boolean getRead() {
        return read;
    }
    public void setRead(Boolean read) {
        this.read = read;
    }
    public Date getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    // Getters and Setters

    
}

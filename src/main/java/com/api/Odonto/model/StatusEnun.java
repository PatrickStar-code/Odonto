package com.api.Odonto.model;

public enum StatusEnun {
    PENDENTE("PENDING"),
    CONFIRMADO("ACCEPTED"),
    RECUSADO("REJECTED"),
    CANCELADO("CANCELED");
    
    private String status;
    
    StatusEnun(String status){
       this.status = status;
    }

    public String getStatus() {
        return status;
    }   
   
}

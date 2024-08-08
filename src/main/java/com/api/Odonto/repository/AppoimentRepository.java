package com.api.Odonto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.Odonto.model.Appointment;
@Repository
public interface AppoimentRepository extends JpaRepository<Appointment, Long> {

    
}
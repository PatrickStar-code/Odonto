package com.api.Odonto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.Odonto.model.Dentist;

@Repository
public interface DentistRepository  extends JpaRepository<Dentist, Long> {

    
}
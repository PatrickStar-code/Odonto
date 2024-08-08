package com.api.Odonto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.Odonto.model.Specialization;

@Repository
public interface SpecializationRepository extends JpaRepository<Specialization, Long> {
    
}

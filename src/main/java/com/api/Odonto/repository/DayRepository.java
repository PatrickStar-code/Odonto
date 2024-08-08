package com.api.Odonto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.Odonto.model.Day;

@Repository
public interface DayRepository  extends JpaRepository<Day, Long>{
    
}

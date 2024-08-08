package com.api.Odonto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.Odonto.model.Schedule;

@Repository
public interface ScheduleRepository extends JpaRepository<Schedule, Long> {
    
}

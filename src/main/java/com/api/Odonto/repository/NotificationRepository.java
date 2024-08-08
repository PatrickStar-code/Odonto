package com.api.Odonto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.Odonto.model.Notification;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Long> {
    
}

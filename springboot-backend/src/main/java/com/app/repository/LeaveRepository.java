package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.LeaveApplication;

public interface LeaveRepository extends JpaRepository<LeaveApplication, Long> {

}
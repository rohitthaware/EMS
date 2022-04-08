package com.app.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.ems.model.LeaveApplication;

public interface LeaveRepository extends JpaRepository<LeaveApplication, Long> {

}
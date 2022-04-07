package net.javaguides.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.springboot.model.LeaveApplication;

public interface LeaveRepository extends JpaRepository<LeaveApplication, Long> {

}
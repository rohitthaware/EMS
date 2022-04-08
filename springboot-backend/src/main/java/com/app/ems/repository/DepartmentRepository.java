package com.app.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.ems.model.Department;
import com.app.ems.model.Employee;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long>{

}

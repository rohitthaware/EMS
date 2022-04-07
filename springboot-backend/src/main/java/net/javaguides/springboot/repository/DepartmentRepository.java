package net.javaguides.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.springboot.model.Department;
import net.javaguides.springboot.model.Employee;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long>{

}

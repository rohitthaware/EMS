package com.app.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.ems.model.Training;

@Repository
public interface TrainingRepository extends JpaRepository<Training, Long>{

}

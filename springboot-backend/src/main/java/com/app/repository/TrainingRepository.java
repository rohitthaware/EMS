package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.entities.Training;

@Repository
public interface TrainingRepository extends JpaRepository<Training, Long>{

}

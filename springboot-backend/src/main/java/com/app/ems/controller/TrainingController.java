package com.app.ems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.ems.model.Training;
import com.app.ems.repository.TrainingRepository;
@CrossOrigin("*")
@RestController
@RequestMapping("/ems/v4")
public class TrainingController {

	@Autowired
	private TrainingRepository trainRepo;

	//get all training
	
	@GetMapping("/trainings")
	public List<Training> getAllTrainings(){
		
	return	trainRepo.findAll();
		
	}
	
	@PostMapping("/trainings")
	public Training addTraining(@RequestBody Training t) {
		
		return trainRepo.save(t);
		
	}

}

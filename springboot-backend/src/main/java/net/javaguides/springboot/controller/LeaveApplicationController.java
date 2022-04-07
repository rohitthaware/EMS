package net.javaguides.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import net.javaguides.springboot.exception.ResourceNotFoundException;
import net.javaguides.springboot.model.LeaveApplication;
import net.javaguides.springboot.repository.LeaveRepository;

@CrossOrigin("*")
@RestController
@RequestMapping("/ems/v3")
public class LeaveApplicationController {
  
  @Autowired
  private LeaveRepository leaveRepo;
  
  @GetMapping("/leaveApplication")
    public List<LeaveApplication> getAllLeaves(){
      
      return leaveRepo.findAll();
      
    }
    
    //create a new leave request
    
    @PostMapping("/leaveApplication")
    public LeaveApplication createDept(@RequestBody LeaveApplication leave) {
      
      return leaveRepo.save(leave);
      
    }
    
    // get leaveRequest by id
    @PutMapping("/leaveApplication/{id}")
    public ResponseEntity<LeaveApplication> getLeaveById(@PathVariable Long id) {
      
      LeaveApplication foundLeave = leaveRepo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Leave Application of id "+ id + "unavailable"));
      
      return ResponseEntity.ok(foundLeave);
      
    }
  

}
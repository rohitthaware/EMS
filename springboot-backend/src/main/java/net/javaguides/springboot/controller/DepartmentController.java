package net.javaguides.springboot.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import net.javaguides.springboot.exception.ResourceNotFoundException;
import net.javaguides.springboot.model.*;
import net.javaguides.springboot.repository.DepartmentRepository;


@CrossOrigin("*")
@RestController
@RequestMapping("/ems/v2")
public class DepartmentController {

  @Autowired 
  private DepartmentRepository deptRepo;
  
  @GetMapping("/department")
  public List<Department> getAllDept(){
    
    return deptRepo.findAll();    
    
  }
  
  //create a new dept
  
  @PostMapping("/department")
  public Department createDept(@RequestBody Department dept) {
    
    return deptRepo.save(dept);
    
  }
  
  // get dept by id
  @GetMapping("/department/{id}")
  public ResponseEntity<Department> getDeptById(@PathVariable Long id) {
    
    Department foundDept = deptRepo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Department of id "+ id + "unavailable"));
    
    return ResponseEntity.ok(foundDept);
    
  }
  
  public ResponseEntity<Map<String, Boolean>> deleteEmployee(@PathVariable Long id){
		Department employee = deptRepo.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id :" + id));
		
		deptRepo.delete(employee);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
  
}
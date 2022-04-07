package net.javaguides.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "trainings")
public class Training {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "Employee_id")
	private int empId;
	@Column(name = "Course_number")
	private int courseNo;
	@Column(name = "Course_Name")
	private String courseName;
	@Column(name = "Training_Department")
	private String trainingDepartment;
//	@Column(name="Training_details")
//	private String trainingDetails;

	public Training() {
		// TODO Auto-generated constructor stub
	}

	public Training(Long id, int empId, int courseNo, String courseName, String trainingDepartment) {
		super();
		this.id = id;
		this.empId = empId;
		this.courseNo = courseNo;
		this.courseName = courseName;
		this.trainingDepartment = trainingDepartment;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public int getCourseNo() {
		return courseNo;
	}

	public void setCourseNo(int courseNo) {
		this.courseNo = courseNo;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getTrainingDepartment() {
		return trainingDepartment;
	}

	public void setTrainingDepartment(String trainingDepartment) {
		this.trainingDepartment = trainingDepartment;
	}

}

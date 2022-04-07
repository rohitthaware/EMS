package net.javaguides.springboot.model;
  
  import java.util.Date;
  
  import javax.persistence.*;
  
  @Entity
  @Table(name="leave_application")
  public class LeaveApplication {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    
    @Column(name="emp_id")
    private long empId;
    
    @Column(name="start_date")
    @Temporal(TemporalType.DATE)
    private Date startDate;
    
    @Column(name="end_date")
    @Temporal(TemporalType.DATE)
    private Date endDate;
    
    @Column
    private String leaveType;
  
    @Column
    private int leavesRemaining;

	public LeaveApplication() {
		super();
	}

	public LeaveApplication(int id, Date startDate, Date endDate, String leaveType, int leavesRemaining) {
		super();
		this.id = id;
		this.startDate = startDate;
		this.endDate = endDate;
		this.leaveType = leaveType;
		this.leavesRemaining = leavesRemaining;
	}

	public long getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getLeaveType() {
		return leaveType;
	}

	public void setLeaveType(String leaveType) {
		this.leaveType = leaveType;
	}

	public int getLeavesRemaining() {
		return leavesRemaining;
	}

	public void setLeavesRemaining(int leavesRemaining) {
		this.leavesRemaining = leavesRemaining;
	}
    
  }
  
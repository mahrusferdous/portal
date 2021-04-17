package portal.ee.domain.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

//Representation of the database Table
//ORM -> () 

@Entity(name = "EMPLOYEES")
@Table(name = "EMPLOYEES", schema = "HR")
public class Employees {
	
	@Column(name = "EMPLOYEE_ID")
	private int employeeId;
	
	@Column(name= "FIRST_NAME")
	private String firstName;
	
	@Column(name= "LAST_NAME")
	private String lastName;
	
	@Column(name= "EMAIL")
	private String email;
	
	@Column(name= "PHONE_NUMBER")
	private int phoneNumber;
	
	@Column(name= "HIRE_DATE")
	private LocalDateTime hireDate;
	
	@Column(name= "JOB_ID")
	private String jobId;
	
	@Column(name= "SALARY")
	private double salary;
	
	@Column(name= "COMMISSION_PCT")
	private double commisionPct;
	
	@Column(name= "MANAGER_ID")
	private int managerId;
	
	@Column(name= "DEPARTMENT_ID")
	private int deptId;

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public LocalDateTime getHireDate() {
		return hireDate;
	}

	public void setHireDate(LocalDateTime hireDate) {
		this.hireDate = hireDate;
	}

	public String getJobId() {
		return jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getCommisionPct() {
		return commisionPct;
	}

	public void setCommisionPct(double commisionPct) {
		this.commisionPct = commisionPct;
	}

	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	
}

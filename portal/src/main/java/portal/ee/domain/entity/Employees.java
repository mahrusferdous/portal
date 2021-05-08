package portal.ee.domain.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//Representation of the database Table
//ORM -> () 

@Entity(name = "employees")
@Table(name = "EMPLOYEES", schema = "HR")
public class Employees {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "EMPLOYEE_ID")
	private int employeeId;
	
	@Column(name= "FIRST_NAME")
	private String firstName;
	
	@Column(name= "LAST_NAME")
	private String lastName;
	
	@Column(name= "EMAIL")
	private String email;
	
	@Column(name= "PHONE_NUMBER")
	private String phoneNumber;
	
	@Column(name= "HIRE_DATE")
	private LocalDateTime hireDate;
	
	@Column(name= "JOB_ID")
	private String jobId;
	
	@Column(name= "SALARY")
	private Integer salary;
	
	@Column(name= "COMMISSION_PCT")
	private Double commisionPct;
	
	@Column(name= "MANAGER_ID")
	private Integer managerId;
	
	@Column(name= "DEPARTMENT_ID")
	private Integer deptId;

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

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
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

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public Double getCommisionPct() {
		return commisionPct;
	}

	public void setCommisionPct(Double commisionPct) {
		this.commisionPct = commisionPct;
	}

	public Integer getManagerId() {
		return managerId;
	}

	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
	}

	public Integer getDeptId() {
		return deptId;
	}

	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

}

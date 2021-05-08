package portal.ee.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "departments")
@Table(name = "DEPARTMENTS", schema = "HR")
public class Departments {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "DEPARTMENT_ID")
	private int departmentId;
	
	@Column(name = "DEPARTMENT_NAME")
	private String departmentName;
	
	@Column(name = "MANAGER_ID")
	private Integer managerId;
	
	@Column(name = "LOCATION_ID")
	private Integer locationId;

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public Integer getManagerId() {
		return managerId;
	}

	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
	}

	public Integer getLocationId() {
		return locationId;
	}

	public void setLocationId(Integer locationId) {
		this.locationId = locationId;
	}

}

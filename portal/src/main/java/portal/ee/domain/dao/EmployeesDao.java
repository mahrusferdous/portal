package portal.ee.domain.dao;

import java.util.List;

import portal.ee.domain.entity.Employees;

public interface EmployeesDao {
	public List<Employees> findAllEmployees();
}

package portal.ee.domain.dao;

import java.util.List;

import portal.ee.domain.entity.Departments;

public interface DepartmentsDao {
	public List<Departments> findAllDepartments();
}

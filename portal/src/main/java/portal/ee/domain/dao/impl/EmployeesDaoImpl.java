package portal.ee.domain.dao.impl;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Service;

import portal.ee.domain.dao.EmployeesDao;
import portal.ee.domain.entity.Employees;
import portal.ee.domain.entity.JobHistory;

@Service
public class EmployeesDaoImpl implements EmployeesDao{
	
	@Autowired
	HibernateTemplate hibernateTemplate;

	@Override
	public List<Employees> findAllEmployees() {
		Session currentSession = hibernateTemplate.getSessionFactory().getCurrentSession();
		
		String sql = "select * from EMPLOYEES";
		SQLQuery query = currentSession.createSQLQuery(sql);
		query.addEntity(Employees.class);
		List<Employees> results = query.list();
		
		return results;
	}
}

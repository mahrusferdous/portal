package portal.ee.domain.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Service;

import portal.ee.domain.dao.EmployeesDao;
import portal.ee.domain.entity.Employees;

@Service
public class EmployeesDaoImpl implements EmployeesDao{
	
	@Autowired
	HibernateTemplate hibernateTemplate;

	@Transactional
	@Override
	public List<Employees> findAllEmployees() {
		Session currentSession = hibernateTemplate.getSessionFactory().getCurrentSession();
		
		String sql = "select * from HR.EMPLOYEES";
		SQLQuery query = currentSession.createSQLQuery(sql);
		query.addEntity(Employees.class);
		List<Employees> results = query.list();
		
		return results;
	}
}

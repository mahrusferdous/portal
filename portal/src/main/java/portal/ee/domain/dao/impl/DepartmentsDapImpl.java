package portal.ee.domain.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Service;

import portal.ee.domain.dao.DepartmentsDao;
import portal.ee.domain.entity.Departments;
import portal.ee.domain.entity.JobHistory;

@Service
public class DepartmentsDapImpl implements DepartmentsDao {
	
	@Autowired
	HibernateTemplate hibernateTemplate;

	@Transactional
	@Override
	public List<Departments> findAllDepartments() {
		Session currentSession = hibernateTemplate.getSessionFactory().getCurrentSession();
		
		String sql = "select * from HR.DEPARTMENTS";
		SQLQuery query = currentSession.createSQLQuery(sql);
		query.addEntity(Departments.class);
		List<Departments> results = query.list();
		
		return results;
	}
}

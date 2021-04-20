package portal.ee.domain.dao.impl;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Service;

import portal.ee.domain.dao.JobsDao;
import portal.ee.domain.entity.Jobs;

@Service
public class JobsDaoImpl implements JobsDao{

	@Autowired
	HibernateTemplate hibernateTemplate;

	@Override
	public List<Jobs> findAllJobs() {
		Session currentSession = hibernateTemplate.getSessionFactory().getCurrentSession();
		
		String sql = "select * from JOBS";
		SQLQuery query = currentSession.createSQLQuery(sql);
		query.addEntity(Jobs.class);
		List<Jobs> results = query.list();
		
		return results;
	}
	
	
}

package portal.ee.domain.dao.impl;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Service;

import portal.ee.domain.dao.JobHistoryDao;
import portal.ee.domain.entity.JobHistory;

//dao layer is for create insert delete update 
//without the service jobhistroydaoimpl is a simple java class
@Service
public class JobHistoryDaoImpl implements JobHistoryDao{
	
	//If no autowired, it will be null
	@Autowired
	HibernateTemplate hibernateTemplate;

	@Override
	public List<JobHistory> findAllJobHistory() {
		Session currentSession = hibernateTemplate.getSessionFactory().getCurrentSession();
		
		String sql = "select * from JOB_HISTROY";
		SQLQuery query = currentSession.createSQLQuery(sql);
		query.addEntity(JobHistory.class);
		List<JobHistory> results = query.list();
		
		return results;
	}

}

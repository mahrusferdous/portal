package portal.ee.domain.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Service;

import portal.ee.domain.dao.RegionsDao;
import portal.ee.domain.entity.JobHistory;
import portal.ee.domain.entity.Regions;

@Service
public class RegionsDaoImpl implements RegionsDao {
	
	@Autowired
	HibernateTemplate hibernateTemplate;

	@Transactional
	@Override
	public List<Regions> findAllRegions() {
		Session currentSession = hibernateTemplate.getSessionFactory().getCurrentSession();
		
		String sql = "select * from HR.REGIONS";
		SQLQuery query = currentSession.createSQLQuery(sql);
		query.addEntity(Regions.class);
		List<Regions> results = query.list();
		
		return results;
	}
	
}

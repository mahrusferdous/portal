package portal.ee.domain.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Service;

import portal.ee.domain.dao.LocationsDao;
import portal.ee.domain.entity.JobHistory;
import portal.ee.domain.entity.Locations;

@Service
public class LocationsDaoImpl implements LocationsDao {
	
	@Autowired
	HibernateTemplate hibernateTemplate;

	@Transactional
	@Override
	public List<Locations> findAllLocations() {
		Session currentSession = hibernateTemplate.getSessionFactory().getCurrentSession();
		
		String sql = "select * from HR.LOCATIONS";
		SQLQuery query = currentSession.createSQLQuery(sql);
		query.addEntity(Locations.class);
		List<Locations> results = query.list();
		
		return results;
	}
}

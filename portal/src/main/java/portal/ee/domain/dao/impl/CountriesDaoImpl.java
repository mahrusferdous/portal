package portal.ee.domain.dao.impl;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Service;

import portal.ee.domain.dao.CountriesDao;
import portal.ee.domain.entity.Countries;

@Service
public class CountriesDaoImpl implements CountriesDao {

	@Autowired
	HibernateTemplate hibernateTemplate;

	@Override
	public List<Countries> findAllCountries() {
		Session currentSession = hibernateTemplate.getSessionFactory().getCurrentSession();
		
		String sql = "select * from Countries";
		SQLQuery query = currentSession.createSQLQuery(sql);
		query.addEntity(Countries.class);
		List<Countries> results = query.list();
		
		return results;
	}
}

package portal.ee.domain.dao;

import java.util.List;

import portal.ee.domain.entity.Countries;

public interface CountriesDao {
	public List<Countries> findAllCountries();
}

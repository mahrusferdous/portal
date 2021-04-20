package portal.ee.domain.dao;

import java.util.List;

import portal.ee.domain.entity.Locations;

public interface LocationsDao {
	public List<Locations> findAllLocations();
}

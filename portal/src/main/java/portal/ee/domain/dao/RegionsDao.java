package portal.ee.domain.dao;

import java.util.List;

import portal.ee.domain.entity.Regions;

public interface RegionsDao {
	public List<Regions> findAllRegions();
}

package portal.ee.domain.dao;

import java.util.List;

import portal.ee.domain.entity.Jobs;

public interface JobsDao {
	public List<Jobs> findAllJobs();
}

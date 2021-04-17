package portal.ee.domain.dao;

import java.util.List;

import portal.ee.domain.entity.JobHistory;

public interface JobHistoryDao {
	// This is going to be used for executing select * from HR.JOB_HISTORY
	public List<JobHistory> findAllJobHistory();
	
}

package portal.ee.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import portal.ee.domain.dao.JobHistoryDao;
import portal.ee.domain.entity.JobHistory;

//tells the spring its a controller class
@Controller
@RequestMapping("/jobhistory")
public class JobHistroyController {
	
	private static Logger logger = LoggerFactory.getLogger(JobHistroyController.class);

    @Autowired
    JobHistoryDao jobHistoryDao;

    @RequestMapping("/all")
    public ModelAndView getJobHistories() {
    	
    	logger.info("/jobhitory/all was called successfully");

        List<JobHistory> findAllJobHistory = jobHistoryDao.findAllJobHistory();
        logger.debug("{} Number of records were returned from jobhitory table", findAllJobHistory.size());

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("jobhistory");
        modelAndView.addObject("histories", findAllJobHistory);

        return modelAndView;
    }
}
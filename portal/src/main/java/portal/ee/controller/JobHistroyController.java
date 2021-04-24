package portal.ee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.web.bind.annotation.RequestMapping;

import portal.ee.domain.dao.JobHistoryDao;

@Controller
@RequestMapping("/jobhistory")
public class JobHistroyController {
	
	@Autowired
	JobHistoryDao jobHistoryDao;
	
	@RequestMapping("/all")
	public ModelAndView getAllJobHistories() {
		List<JobHitory> findAllJobhistory = jobHistoryDao.findAllJobHistory();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("jobHistory");
		modelAndView.addObject("histoies", findAllJobHistory);
		return modelAndView;
	}
}

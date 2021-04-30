package portal.ee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import portal.ee.domain.dao.JobHistoryDao;
import portal.ee.domain.entity.JobHistory;

@Controller
@RequestMapping("/jobhistory")
public class JobHistroyController {

    @Autowired
    JobHistoryDao jobHistoryDao;

    @RequestMapping("/all")
    public ModelAndView getJobHistories() {

        List<JobHistory> findAllJobHistory = jobHistoryDao.findAllJobHistory();

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("jobhistory");
        modelAndView.addObject("histories", findAllJobHistory);

        return modelAndView;
    }
}
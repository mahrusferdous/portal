package portal.ee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import portal.ee.domain.dao.DepartmentsDao;
import portal.ee.domain.entity.Departments;

@Controller
@RequestMapping("/departments")
public class DepartmentsController {
	
	@Autowired
	DepartmentsDao departmentsDao;
	
	@RequestMapping("/all")
	public ModelAndView getDepartments() {
		
		List<Departments> findAllDepartments = departmentsDao.findAllDepartments();
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("departments");
		modelAndView.addObject("allDepartments", findAllDepartments);
		
		return modelAndView;
	}
}
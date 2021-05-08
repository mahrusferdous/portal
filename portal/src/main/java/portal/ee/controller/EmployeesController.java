package portal.ee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import portal.ee.domain.dao.EmployeesDao;
import portal.ee.domain.entity.Employees;

@Controller
@RequestMapping("/employees")
public class EmployeesController {
	
	@Autowired
	EmployeesDao employeesDao;
	
	@RequestMapping("/all")
	public ModelAndView getEmployees() {
		
		List<Employees> findAllEmployees = employeesDao.findAllEmployees();
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("employees");
		modelAndView.addObject("allEmployees", findAllEmployees);
		
		return modelAndView;
	}
}
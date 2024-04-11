
package com.mycompany.EmployeemanagementSystem.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.mycompany.EmployeemanagementSystem.Entity.Employee;
import com.mycompany.EmployeemanagementSystem.service.EmployeeService;
/**
 *
 * @author Rashid Williams
 */
@Controller
public class EmployeeController {
    private EmployeeService employeeservice;
    
    public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeservice = employeeService;
	}
    
    // handler method to handle list Employee and return mode and view
	@GetMapping("/employees")
	public String listEmployees(Model model) {
		model.addAttribute("employees", employeeservice.getAllEmployees());
		return "employees";
	}
}


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
    @GetMapping("/employees/new")
	public String createemployeeForm(Model model) {
		
		// create student object to hold student form data
		Employee employee = new Employee();
		model.addAttribute("employee", employee);
		return "create_employee";
		
	}
    	
    @PostMapping("/employees")
	public String saveEmployee(@ModelAttribute("employee") Employee employee) {
            employeeservice.saveEmployee(employee);
            return "redirect:/employees";
	}
    
    @GetMapping("/employees/edit/{id}")
	public String editEmployeeForm(@PathVariable Long id, Model model) {
		model.addAttribute("employee", employeeservice.getEmployeeById(id));
		return "edit_employee";
	}
    
    @PostMapping("/employees/{id}")
	public String updateStudent(@PathVariable Long id,
			@ModelAttribute("employee") Employee employee,
			Model model) {
		
		// get employee from database by id
		Employee existingEmployee = employeeservice.getEmployeeById(id);
		existingEmployee.setId(id);
		existingEmployee.setFirstName(employee.getFirstName());
		existingEmployee.setLastName(employee.getLastName());
//                existingEmployee.setrole(employee.getrole());
                existingEmployee.setSalary(employee.getSalary());
                existingEmployee.setGender(employee.getGender());
		existingEmployee.setEmail(employee.getEmail());
		
		// save updated employee object
		employeeservice.updateEmployee(existingEmployee);
		return "redirect:/employees";		
	}
    
    // handler method to handle delete student request
	
    @GetMapping("/employees/{id}")
    public String deleteEmployee(@PathVariable Long id) {
	employeeservice.deleteEmployeeById(id);
	return "redirect:/employees";
    }
        
    
}


package com.mycompany.EmployeemanagementSystem.service;
import java.util.List;
import com.mycompany.EmployeemanagementSystem.Entity.Employee;
/**
 *
 * @author Rashid Williams
 */
public interface EmployeeService {
    List<Employee> getAllEmployees();
	
	Employee saveEmployee(Employee employee);
	
	Employee getEmployeeById(Long id);
	
	Employee updateEmployee(Employee employee);
	
	void deleteEmployeeById(Long id);
}

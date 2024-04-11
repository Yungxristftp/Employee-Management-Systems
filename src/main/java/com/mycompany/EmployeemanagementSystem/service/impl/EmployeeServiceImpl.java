
package com.mycompany.EmployeemanagementSystem.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import com.mycompany.EmployeemanagementSystem.Entity.Employee;
import com.mycompany.EmployeemanagementSystem.repository.EmployeeRepository;
import com.mycompany.EmployeemanagementSystem.service.EmployeeService;

/**
 *
 * @author Rashid Williams
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {
    
    private EmployeeRepository employeeRepository;
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}
//        @Override
//	public List<Employee> getAllEmployee() {
//		return employeeRepository.findAll();
//        }

        @Override
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public Employee getEmployeeById(Long id) {
		return employeeRepository.findById(id).get();
	}

//	@Override
//	public Employee updateEpmloyee(Employee employee) {
//		return employeeRepository.save(employee);
//	}

	@Override
	public void deleteEmployeeById(Long id) {
		employeeRepository.deleteById(id);	
	}

    @Override
    public List<Employee> getAllEmployees() {
       return employeeRepository.findAll();
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

}

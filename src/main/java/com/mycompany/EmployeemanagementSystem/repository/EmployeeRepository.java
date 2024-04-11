package com.mycompany.EmployeemanagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mycompany.EmployeemanagementSystem.Entity.Employee;

/**
 *
 * @author Rashid Williams
 */
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
    
}
package com.mycompany.EmployeemanagementSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mycompany.EmployeemanagementSystem.Entity.Employee;
import com.mycompany.EmployeemanagementSystem.repository.EmployeeRepository;

@SpringBootApplication
public class EmployeeManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementSystemApplication.class, args);
	}
    @Autowired
    private EmployeeRepository employeeRepository;
    
    @Override
    public void run(String... args) throws Exception {
        
//    Employee employee1 = new Employee("John", "Brown","male","Janitor",52000,"Brown@gmail.com");
//        employeeRepository.save(employee1);
//    
//     Employee employee2 = new Employee("Bob", "Jones","male","Software Engineer",100000,"Jones@gmail.com");
//        employeeRepository.save(employee2);
//        
//     Employee employee3 = new Employee("Sarah", "Williams","female","Offcie Admin",80000,"Brown@gmail.com");
//        employeeRepository.save(employee3);
//    
 
    
    }

}

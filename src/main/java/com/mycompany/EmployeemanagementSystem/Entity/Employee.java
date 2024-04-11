
package com.mycompany.EmployeemanagementSystem.Entity;

import jakarta.persistence.*;
/**
 *
 * @author Rashid Williams
 */
@Entity
@Table(name = "Employees")
public class Employee {
    	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "first_name", nullable = false)
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
        
        @Column(name = "gender")
	private String gender;
        
        @Column(name = "Salary")
	private double salary;
        
	@Column(name = "email")
	private String email;
	
	public Employee() {
		
	}
        
        public Employee(String firstName, String lastName,String gender, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
                this.gender= gender;
                this.salary= salary;
		this.email = email;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
     // Getter method for salary    
         public double getSalary() {
                return salary;
    }

    // Setter method for salary
        public void setSalary(double salary) {
               this.salary = salary;
    }
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
        public String getgender() {
            return gender;
	}
	public void setgender(String gender) {
            this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}

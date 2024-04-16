
package com.mycompany.EmployeemanagementSystem.service;

import com.mycompany.EmployeemanagementSystem.dto.UserRegistrationDto;
import com.mycompany.EmployeemanagementSystem.Entity.User;
import org.springframework.security.core.userdetails.UserDetailsService;
/**
 *
 * @author Rashid Williams
 */
public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);
}

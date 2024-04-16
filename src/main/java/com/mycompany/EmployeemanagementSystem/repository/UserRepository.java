
package com.mycompany.EmployeemanagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mycompany.EmployeemanagementSystem.Entity.User;
/**
 *
 * @author Rashid Williams
 */

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}

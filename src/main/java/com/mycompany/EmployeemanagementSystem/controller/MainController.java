
package com.mycompany.EmployeemanagementSystem.controller;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;


/**
 *
 * @author Rashid Williams
 */
@Controller
public class MainController {
    
	@GetMapping("/login")
	public String login() {
		return "login";
	}
}

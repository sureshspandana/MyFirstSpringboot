package com.suresh.java.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

	@GetMapping("/admin")
	public String getAdminDetails() {
		return "Admin Details from DB";
	}
	
	@GetMapping("/admin/user")
	public String getUserDetails() {
		return "User Details from DB";
	}
}

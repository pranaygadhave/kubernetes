package com.employee.management.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.management.exception.EmployeeIDException;
import com.employee.management.globalexception.InValidEmployeeIDException;
import com.employee.management.service.EmployeeService;
import com.employee.management.vo.EmployeeVO;

	@RestController
	@RequestMapping("/employee")
	public class EmployeeController {
		private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);
		@Autowired
		EmployeeService employeeService;

		@GetMapping("/get/{employeeID}")
		public EmployeeVO getEmployeeById(@PathVariable long employeeID)
				throws EmployeeIDException, InValidEmployeeIDException {
		logger.info("Getting user by ID: {}", employeeID);
			
			return employeeService.getEmployeeById(employeeID);
		}

	}



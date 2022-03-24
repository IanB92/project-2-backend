package com.project2.project2reimbursementbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project2.project2reimbursementbackend.exception.SystemException;
import com.project2.project2reimbursementbackend.service.EmployeeService;
import com.project2.project2reimbursementbackend.to.EmployeeTo;

@RestController // a combination of @Controller and @ResponseBody
@CrossOrigin
@RequestMapping("api")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	//
	@PostMapping("/employee-login")
	EmployeeTo employeeLogin(@RequestBody EmployeeTo employee)throws SystemException{
		return  employeeService.employeeLogin(employee);
	}
	//http://127.0.0.1:4444
	@GetMapping("/employee-info/{employeeId}")
	EmployeeTo employeeInfo(@PathVariable("employeeId") int eid)throws SystemException {
		return employeeService.employeeInfo(eid);
	}
	
	@PutMapping("/employee-update")
	EmployeeTo employeeUpdate(@RequestBody EmployeeTo employee)throws SystemException {
		return employeeService.employeeUpdate(employee);
	}
	
	
	
}

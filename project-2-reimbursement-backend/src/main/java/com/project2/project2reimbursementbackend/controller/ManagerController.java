package com.project2.project2reimbursementbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.project2.project2reimbursementbackend.service.ManagerService;
import com.project2.project2reimbursementbackend.to.ManagerPojo;
import com.project2.project2reimbursementbackend.exception.SystemException;


@RestController
@CrossOrigin
@RequestMapping("api")
public class ManagerController {
	@Autowired
	ManagerService managerService;
	
	@PostMapping("/manager-login")
	ManagerPojo managerLogin(@RequestBody ManagerPojo manager)throws SystemException{
		return  managerService.managerLogin(manager);
	}

}

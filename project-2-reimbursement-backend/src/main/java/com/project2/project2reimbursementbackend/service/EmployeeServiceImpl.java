package com.project2.project2reimbursementbackend.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project2.project2reimbursementbackend.dao.EmployeeDao;
import com.project2.project2reimbursementbackend.entity.EmployeeEntity;
import com.project2.project2reimbursementbackend.exception.SystemException;
import com.project2.project2reimbursementbackend.to.EmployeeTo;


@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	
	@Autowired
	EmployeeDao employeeDao;
	
//	 USE ANNOTATION FOR CONSTUCTOR 
//	public EmployeeServiceImpl() {
//		employeeDao = new EmployeeDaoImpl();
//		// TODO Auto-generated constructor stub
//	}

	@Override
	public EmployeeTo employeeLogin(EmployeeTo employee){
		// TODO Auto-generated method stub
		Optional<EmployeeEntity> optional = employeeDao.findByEmployeeUsernameAndEmployeePassword(employee.getEmployeeUsername(), employee.getEmployeePassword());
		if(optional.isPresent()) {
			EmployeeEntity employeeEntity = optional.get();
			employee = new EmployeeTo(employeeEntity.getEmployeeId(), employeeEntity.getEmployeeFirstName(),
					employeeEntity.getEmployeeLastName(), employeeEntity.getEmployeeAddress(),
					employeeEntity.getEmployeeContact(), employeeEntity.getEmployeeEmail(), 
					employeeEntity.getEmployeeUsername(), employeeEntity.getEmployeePassword());
		}
			return employee;
	}





	@Override
	public EmployeeTo employeeInfo(int employeeId) {
		Optional<EmployeeEntity> optional = employeeDao.findById(employeeId);
		EmployeeTo employee = null;
		if(optional.isPresent()) {
			EmployeeEntity employeeEntity = optional.get();
			employee = new EmployeeTo(employeeEntity.getEmployeeId(), employeeEntity.getEmployeeFirstName(), employeeEntity.getEmployeeLastName(),
					employeeEntity.getEmployeeAddress(), employeeEntity.getEmployeeContact(), employeeEntity.getEmployeeEmail(),
					employeeEntity.getEmployeeUsername(), employeeEntity.getEmployeePassword());
		}

		return employee;
	}

	@Override
	public EmployeeTo employeeUpdate(EmployeeTo employee){
		EmployeeEntity employeeEntity = new EmployeeEntity(employee.getEmployeeId(), employee.getEmployeeFirstName(), employee.getEmployeeLastName(),
				employee.getEmployeeAddress(), employee.getEmployeePhoneNumber(), employee.getEmployeeEmail(), 
				employee.getEmployeeUsername(), employee.getEmployeePassword());
			employeeDao.save(employeeEntity);
			employee = new EmployeeTo(employeeEntity.getEmployeeId(), employeeEntity.getEmployeeFirstName(),
					employeeEntity.getEmployeeLastName(), employeeEntity.getEmployeeAddress(),
					employeeEntity.getEmployeeContact(), employeeEntity.getEmployeeEmail(), 
					employeeEntity.getEmployeeUsername(), employeeEntity.getEmployeePassword());
			return employee;
	}
		
}

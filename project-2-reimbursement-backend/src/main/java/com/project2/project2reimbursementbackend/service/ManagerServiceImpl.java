package com.project2.project2reimbursementbackend.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project2.project2reimbursementbackend.dao.ManagerDao;
import com.project2.project2reimbursementbackend.entity.EmployeeEntity;
import com.project2.project2reimbursementbackend.entity.ManagerEntity;
import com.project2.project2reimbursementbackend.exception.SystemException;
import com.project2.project2reimbursementbackend.to.ManagerPojo;

	@Service
	public class ManagerServiceImpl implements ManagerService {
		
		//interface refrence variable 
		@Autowired
		ManagerDao managerDao;

		@Override
		public ManagerPojo managerLogin(ManagerPojo manager){
			Optional<ManagerEntity> optional = managerDao.findByUsernameAndPassword(manager.getUsername(), manager.getPassword());
			if(optional.isPresent()) {
				ManagerEntity managerEntity = optional.get();
			
		manager = new ManagerPojo(managerEntity.getManagerId(), managerEntity.getFirstName(),
					managerEntity.getLastName(), managerEntity.getAddress(),
					managerEntity.getContact(), managerEntity.getEmail(), 
					managerEntity.getUserName(), managerEntity.getPassword());
			}
		return manager;
	}
			// TODO Auto-generated method stub
	
		
	}
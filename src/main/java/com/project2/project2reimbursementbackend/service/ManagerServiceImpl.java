package com.project2.project2reimbursementbackend.service;


import org.springframework.beans.factory.annotation.Autowired;

import com.project2.project2reimbursementbackend.dao.ManagerDao;

import com.project2.project2reimbursementbackend.entity.ManagerEntity;

import com.project2.project2reimbursementbackend.to.ManagerPojo;

	
	public class ManagerServiceImpl implements ManagerService {
		
		//interface refrence variable 
		@Autowired
		ManagerDao managerDao;

		@Override
		public ManagerPojo managerLogin(ManagerPojo manager) {
			ManagerEntity managerEntity = new ManagerEntity(
					manager.getManagerId(), manager.getFirstName(),
					manager.getLastName(), manager.getAddress(),
					manager.getContact(), manager.getEmail(),
					manager.getUserName(), manager.getPassword());
			managerDao.saveAndFlush(managerEntity);
		manager = new ManagerPojo(managerEntity.getManagerId(), managerEntity.getFirstName(),
					managerEntity.getLastName(), managerEntity.getAddress(),
					managerEntity.getContact(), managerEntity.getEmail(), 
					managerEntity.getUserName(), managerEntity.getPassword());
		return manager;
	}
			// TODO Auto-generated method stub
	
		
	}
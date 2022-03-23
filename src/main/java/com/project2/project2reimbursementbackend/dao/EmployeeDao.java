package com.project2.project2reimbursementbackend.dao;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project2.project2reimbursementbackend.entity.EmployeeEntity;



@Repository

public interface EmployeeDao extends JpaRepository<EmployeeEntity, Integer> {

	Optional<EmployeeEntity> findByEmployeeUsernameAndEmployeePassword(String employeeUsername, String employeePassword);
	


}

package com.project2.project2reimbursementbackend.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project2.project2reimbursementbackend.entity.EmployeeEntity;
import com.project2.project2reimbursementbackend.to.EmployeeTo;
import com.project2.project2reimbursementbackend.to.ReimbursementPojo;


@Repository

public interface EmployeeDao extends JpaRepository<EmployeeEntity, Integer> {
	


}

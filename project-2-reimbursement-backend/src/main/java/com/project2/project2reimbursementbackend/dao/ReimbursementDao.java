package com.project2.project2reimbursementbackend.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project2.project2reimbursementbackend.entity.ReimbursementEntity;
import com.project2.project2reimbursementbackend.exception.SystemException;

public interface ReimbursementDao extends JpaRepository<ReimbursementEntity, Integer>{

	

	List<ReimbursementEntity> findAllByEmployeeIdAndState(int employeeId, String string);

	List<ReimbursementEntity> findAllByEmployeeId(int employeeId);

	List<ReimbursementEntity> findByState(String state);

	List<ReimbursementEntity> findAllByStatus(String status);

}

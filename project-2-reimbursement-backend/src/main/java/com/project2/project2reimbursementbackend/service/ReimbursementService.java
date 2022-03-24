package com.project2.project2reimbursementbackend.service;

import java.util.List;

import com.project2.project2reimbursementbackend.exception.SystemException;
import com.project2.project2reimbursementbackend.to.ReimbursementPojo;

public interface ReimbursementService {
ReimbursementPojo employeeRequest(ReimbursementPojo reimbursement);
	
	List<ReimbursementPojo> employeeViewMyPending(int employeeId);
	
	List<ReimbursementPojo> employeeViewMyApproved(int employeeId);
	
	// Manager reimbursement
	List<ReimbursementPojo> fetchAllPending();

	List<ReimbursementPojo> fetchAllApproved();

	List<ReimbursementPojo> fetchAllDenied();

	ReimbursementPojo approve(int reimId);

	ReimbursementPojo deny(int reimId);

	List<ReimbursementPojo> fetchEmpReimbursement(int employeeId) ;

}

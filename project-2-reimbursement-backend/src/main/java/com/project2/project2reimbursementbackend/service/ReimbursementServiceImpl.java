package com.project2.project2reimbursementbackend.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.project2.project2reimbursementbackend.dao.ReimbursementDao;
import com.project2.project2reimbursementbackend.entity.ReimbursementEntity;
import com.project2.project2reimbursementbackend.exception.SystemException;
import com.project2.project2reimbursementbackend.to.ReimbursementPojo;
import lombok.extern.slf4j.Slf4j;
@Service
public class ReimbursementServiceImpl implements ReimbursementService{

	
	@Autowired
	ReimbursementDao reimbursementDao;
	
	
	@Override
	public ReimbursementPojo employeeRequest(ReimbursementPojo reimbursement) {
	//	log.info("Inside employeerequest of Employee Service");
		reimbursement.setState("Pending");
		ReimbursementEntity reimbursementEntity = new ReimbursementEntity(
				reimbursement.getReimbursementId(), reimbursement.getEmployeeId(),reimbursement.getState(),
				reimbursement.getReimbursementAmount(), reimbursement.getReimbursementReason(),
				reimbursement.getReimbursementDate(), reimbursement.getStatus());
		reimbursementDao.save(reimbursementEntity);
		// TODO Auto-generated method stub
		return reimbursement;
	}

	@Override
	public List<ReimbursementPojo> employeeViewMyPending(int employeeId) {
		// TODO Auto-generated method stub
		List<ReimbursementPojo> viewPending = new ArrayList<ReimbursementPojo>();
		List<ReimbursementEntity>viewPendingEntity = reimbursementDao.findAllByEmployeeIdAndState(employeeId, "Pending");
		for(ReimbursementEntity reimbursementEntity: viewPendingEntity) {
			ReimbursementPojo reimbursementPojo = new ReimbursementPojo(reimbursementEntity.getReimbursementId(),
					reimbursementEntity.getEmployeeId(), reimbursementEntity.getState(),  reimbursementEntity.getReimbursement_amount(), 
					reimbursementEntity.getReimbursement_reason(), reimbursementEntity.getReimbursementDate(), 
					reimbursementEntity.getStatus());
			viewPending.add(reimbursementPojo);
		}
		return viewPending;
	}

	@Override
	public List<ReimbursementPojo> employeeViewMyApproved(int employeeId) {
		// TODO Auto-generated method stub
		List<ReimbursementPojo> viewPending = new ArrayList<ReimbursementPojo>();
		List<ReimbursementEntity>viewPendingEntity = reimbursementDao.findAllByEmployeeIdAndState(employeeId, "Resolved");
		for(ReimbursementEntity reimbursementEntity: viewPendingEntity) {
			ReimbursementPojo reimbursementPojo = new ReimbursementPojo(reimbursementEntity.getReimbursementId(),
					reimbursementEntity.getEmployeeId(), reimbursementEntity.getState(), reimbursementEntity.getReimbursement_amount(), 
					reimbursementEntity.getReimbursement_reason(), reimbursementEntity.getReimbursementDate(), 
					reimbursementEntity.getStatus());
			viewPending.add(reimbursementPojo);
		}
		return viewPending;
	}
	
	// Manager ReimbursementPojo////////////////////////////////////////////////////////////////////////////

	@Override
	// "SELECT * FROM reimbursement_details WHERE state = 'pending'"
	public List<ReimbursementPojo> fetchAllPending() {
		// TODO Auto-generated method stub
		List<ReimbursementPojo> allPending = new ArrayList<ReimbursementPojo>(); 
		List<ReimbursementEntity>viewPendingEntity = reimbursementDao.findByState("Pending");
		for(ReimbursementEntity reimbursementEntity: viewPendingEntity) {
			ReimbursementPojo reimbursementPojo = new ReimbursementPojo(reimbursementEntity.getReimbursementId(),
					reimbursementEntity.getEmployeeId(), reimbursementEntity.getState(), reimbursementEntity.getReimbursement_amount(), 
					reimbursementEntity.getReimbursement_reason(), reimbursementEntity.getReimbursementDate(), 
					reimbursementEntity.getStatus());
			allPending.add(reimbursementPojo);
		}
		return allPending;
	}

	@Override
	// SELECT * FROM reimbursement_details WHERE status='approved' OR status='Approved'";
	
	public List<ReimbursementPojo> fetchAllApproved(){
		// TODO Auto-generated method stub
		List<ReimbursementPojo> allResolved = new ArrayList<ReimbursementPojo>(); 
		List<ReimbursementEntity>viewResolvedEntity = reimbursementDao.findAllByStatus("Approved");
		for(ReimbursementEntity reimbursementEntity: viewResolvedEntity) {
			ReimbursementPojo reimbursementPojo = new ReimbursementPojo(reimbursementEntity.getReimbursementId(),
					reimbursementEntity.getEmployeeId(), reimbursementEntity.getState(),  reimbursementEntity.getReimbursement_amount(), 
					reimbursementEntity.getReimbursement_reason(), reimbursementEntity.getReimbursementDate(), 
					reimbursementEntity.getStatus());
			allResolved.add(reimbursementPojo);
		}
		return allResolved;
	}

	@Override
	//SELECT * FROM reimbursement_details WHERE status='deny' OR status='Denied'";
	public List<ReimbursementPojo> fetchAllDenied(){
		// TODO Auto-generated method stub
		List<ReimbursementPojo> allDenied = new ArrayList<ReimbursementPojo>(); 
		List<ReimbursementEntity>allDeniedEntity = reimbursementDao.findAllByStatus("Denied");
		for(ReimbursementEntity reimbursementEntity: allDeniedEntity) {
			ReimbursementPojo reimbursementPojo = new ReimbursementPojo(reimbursementEntity.getReimbursementId(),
					reimbursementEntity.getEmployeeId(), reimbursementEntity.getState(), reimbursementEntity.getReimbursement_amount(), 
					reimbursementEntity.getReimbursement_reason(), reimbursementEntity.getReimbursementDate(), 
					reimbursementEntity.getStatus());
			allDenied.add(reimbursementPojo);
		}
		return allDenied;
	}


	@Override
	public List<ReimbursementPojo> fetchEmpReimbursement(int employeeId) {
		// TODO Auto-generated method stub
		List<ReimbursementPojo> allReimbursement = new ArrayList<ReimbursementPojo>(); 
		List<ReimbursementEntity>allReimbursementEntity = reimbursementDao.findAllByEmployeeId(employeeId);
		for(ReimbursementEntity reimbursementEntity: allReimbursementEntity) {
			ReimbursementPojo reimbursementPojo = new ReimbursementPojo(reimbursementEntity.getReimbursementId(),
					reimbursementEntity.getEmployeeId(), reimbursementEntity.getState(), reimbursementEntity.getReimbursement_amount(), 
					reimbursementEntity.getReimbursement_reason(), reimbursementEntity.getReimbursementDate(), 
					reimbursementEntity.getStatus());
			allReimbursement.add(reimbursementPojo);
		}
		return allReimbursement;
	}
	@Override
	//Update reimbursement_details SET status ='Approved' WHERE  reimbursement_id = reimbursement_Id)";
	public ReimbursementPojo approve(int reimId){
		// TODO Auto-generated method stub
		Optional<ReimbursementEntity> optional = reimbursementDao.findById(reimId);
		ReimbursementPojo reimbursementPojo = null;
		
		if(optional.isPresent()) {
			ReimbursementEntity reimbursementEntity = optional.get();
			reimbursementEntity.setStatus("Approved");
			reimbursementEntity.setState("Resolved");
			reimbursementPojo = new ReimbursementPojo(reimbursementEntity.getReimbursementId(),
					reimbursementEntity.getEmployeeId(), reimbursementEntity.getState(), reimbursementEntity.getReimbursement_amount(), 
					reimbursementEntity.getReimbursement_reason(), reimbursementEntity.getReimbursementDate(), 
					reimbursementEntity.getStatus());
			reimbursementDao.save(reimbursementEntity);
		}
		return reimbursementPojo;
	}

	@Override
	//Update reimbursement_details SET status ='Denied' WHERE  reimbursement_id = reimbursement_Id)";
	public ReimbursementPojo deny(int reimId) {
		Optional<ReimbursementEntity> optional = reimbursementDao.findById(reimId);
		ReimbursementPojo reimbursementPojo = null;
		if(optional.isPresent()) {
			ReimbursementEntity reimbursementEntity = optional.get();
			reimbursementEntity.setStatus("Denied");
			reimbursementEntity.setState("Resolved");
			reimbursementPojo = new ReimbursementPojo(reimbursementEntity.getReimbursementId(),
					reimbursementEntity.getEmployeeId(), reimbursementEntity.getState(), reimbursementEntity.getReimbursement_amount(), 
					reimbursementEntity.getReimbursement_reason(), reimbursementEntity.getReimbursementDate(), 
					reimbursementEntity.getStatus());
			reimbursementDao.save(reimbursementEntity);
		}
		return reimbursementPojo;
	}


}

package com.project2.project2reimbursementbackend.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.project2.project2reimbursementbackend.service.ReimbursementService;
import com.project2.project2reimbursementbackend.to.ReimbursementPojo;


@RestController // a combination of @Controller and @ResponseBody
@CrossOrigin
@RequestMapping("api")
public class ReimbursementController {
	
	@Autowired
	ReimbursementService reimbursementService;
	
	@GetMapping("/employee-request")
	ReimbursementPojo employeeRequest(@RequestBody  ReimbursementPojo reimbursementPojo) {
		return reimbursementService.employeeRequest(reimbursementPojo);
	}
	
	
	@GetMapping("/employee-pending/{employeeId}")
	//ReimbursementPojo employeePending(@RequestBody ReimbursementPojo reimbursementpojo) {
	List<ReimbursementPojo> employeePending(@PathVariable("employeeId") int eid){	
	return reimbursementService.employeeViewMyPending(eid);
	
	}
	
	@GetMapping("/employee-resolved/{employeeId}")
	List<ReimbursementPojo> employeeResolved(@PathVariable("employeeId") int eid) {
		return reimbursementService.employeeViewMyApproved(eid);
	}
	
	// Manager mapping
	@GetMapping("/manager-pending")
	List<ReimbursementPojo> fetchAllPending(){
		return reimbursementService.fetchAllPending();
	}
	
	@GetMapping("/manager-approved")
	List<ReimbursementPojo> fetchAllAppr(){
		return reimbursementService.fetchAllApproved();
	}
	
	@GetMapping("/manager-all-denied")
	List<ReimbursementPojo> fetchAllDenied(){
		return reimbursementService.fetchAllDenied();
	}
	@GetMapping("/manager-emp-reimbursement/{employeeId}")
	List<ReimbursementPojo> fetchEmpReimbursement(@PathVariable("employeeId") int eid){
		return reimbursementService.fetchEmpReimbursement(eid);
	}
	@PutMapping("/manager-approve/{reimId}")
	ReimbursementPojo approve(@PathVariable("reimId") int rid) {
		return reimbursementService.approve(rid);
	}
	
	@PutMapping("/manager-denied/{reimId}")
	ReimbursementPojo denied(@PathVariable("reimId") int rid) {
		return reimbursementService.deny(rid);
	}
	
	
	
}

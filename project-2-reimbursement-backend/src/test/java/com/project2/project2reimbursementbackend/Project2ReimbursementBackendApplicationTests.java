package com.project2.project2reimbursementbackend;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;


import com.project2.project2reimbursementbackend.dao.EmployeeDao;
import com.project2.project2reimbursementbackend.dao.ManagerDao;
import com.project2.project2reimbursementbackend.dao.ReimbursementDao;
import com.project2.project2reimbursementbackend.entity.EmployeeEntity;
import com.project2.project2reimbursementbackend.entity.ManagerEntity;
import com.project2.project2reimbursementbackend.entity.ReimbursementEntity;
import com.project2.project2reimbursementbackend.service.EmployeeServiceImpl;
import com.project2.project2reimbursementbackend.service.ManagerServiceImpl;
import com.project2.project2reimbursementbackend.service.ReimbursementServiceImpl;
import com.project2.project2reimbursementbackend.to.EmployeeTo;
import com.project2.project2reimbursementbackend.to.ManagerPojo;
import com.project2.project2reimbursementbackend.to.ReimbursementPojo;

@TestInstance(Lifecycle.PER_CLASS)
@RunWith(MockitoJUnitRunner.class)
class Project2ReimbursementBackendApplicationTests {

	@InjectMocks
	EmployeeServiceImpl employeeService;

	@Mock
	EmployeeDao employeeDao;

	@BeforeAll
	public void init() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void TestEmployeeInfo() {
		when(employeeDao.findById(1)).thenReturn(Optional.of(new EmployeeEntity(1, "Percy", "Jackson",
				"Camp Half Blood", "777-777-7777", "sonOfPoseidon@Gmail.com", "15", "123")));
		EmployeeTo actualResult = employeeService.employeeInfo(1);
		EmployeeTo expectedResult = new EmployeeTo(1, "Percy", "Jackson", "Camp Half Blood", "777-777-7777",
				"sonOfPoseidon@Gmail.com", "15", "123");
		assertEquals(actualResult, expectedResult);

	}

	@Test
	public void TestEmployeeLogin() {
		EmployeeTo employee = new EmployeeTo(1, "Percy", "Jackson", "Camp Half Blood", "777-777-7777",
				"sonOfPoseidon@Gmail.com", "15", "123");
		when(employeeDao.findByEmployeeUsernameAndEmployeePassword("15", "123"))
				.thenReturn(Optional.of(new EmployeeEntity(1, "Percy", "Jackson", "Camp Half Blood", "777-777-7777",
						"sonOfPoseidon@Gmail.com", "15", "123")));
		EmployeeTo actualResult = employeeService.employeeLogin(employee);
		EmployeeTo expectedResult = new EmployeeTo(1, "Percy", "Jackson", "Camp Half Blood", "777-777-7777",
				"sonOfPoseidon@Gmail.com", "15", "123");
		assertEquals(actualResult, expectedResult);

	}

	@Test
	public void TestEmployeeUpdate() {
		when(employeeDao.findById(1)).thenReturn(Optional.of(new EmployeeEntity(1, "Percy", "Jackson",
				"Camp Half Blood", "777-777-8888", "sonOfPoseidon@Gmail.com", "15", "123")));

		EmployeeTo actualResult = employeeService.employeeUpdate(new EmployeeTo(1, "Percy", "Jackson", "Camp Half Blood", "777-777-7777",
				"sonOfPoseidon@Gmail.com", "15", "123"));
		EmployeeTo expectedResult = new EmployeeTo(1, "Percy", "Jackson", "Camp Half Blood", "777-777-7777",
				"sonOfPoseidon@Gmail.com", "15", "123");
		assertEquals(actualResult, expectedResult);
	}
	@InjectMocks
	ManagerServiceImpl managerService;

	@Mock
	ManagerDao managerDao;

	@Test
	public void TestManagerLogin() {
		ManagerPojo manager = new ManagerPojo(1, "eren", "yeager", "paradise island", "7058752445",
				"attacktitan@gmail.com", "01", "77");
		when(managerDao.findByUsernameAndPassword("01", "77"))
				.thenReturn(Optional.of(new ManagerEntity(1, "eren", "yeager", "paradise island", "7058752445",
						"attacktitan@gmail.com", "01", "77")));
		ManagerPojo actualResult = managerService.managerLogin(manager);
		ManagerPojo expectedResult = new ManagerPojo(1, "eren", "yeager", "paradise island", "7058752445",
				"attacktitan@gmail.com", "01", "77");
		assertEquals(actualResult, expectedResult);

	}

	
	
	@InjectMocks
	ReimbursementServiceImpl reimbursementService;
	
	@Mock
	ReimbursementDao reimbursementDao;
	
	@Test 
	public void TestEmployeeRequest() {
		ReimbursementPojo reimbursement = new ReimbursementPojo(51, 1, "Resolved",  123.50f, "test img", null, "Approved");
		
		when(reimbursementDao.findById(1)).thenReturn(Optional.of(new ReimbursementEntity(1, 1, "Resolved",  123.50f, "test img", null, "Approved")));
		ReimbursementPojo actualResult = reimbursementService.employeeRequest(reimbursement);
		ReimbursementPojo expectedResult = new ReimbursementPojo (51, 1, "Resolved", 123.50f, "test img", null, "Approved" );
		assertEquals(actualResult, expectedResult);
		
	}

	@Test 
	public void TestEmployeePending() {
		ReimbursementPojo reimbursement = new ReimbursementPojo(1, 1, "Pending",  123.50f, "test img", null, "Approved");
		when(reimbursementDao.findById(1)).thenReturn(Optional.of(new ReimbursementEntity(51, 1, "Pending",  123.50f, "test img", null, "Approved")));
		ReimbursementPojo actualResult = reimbursementService.employeeRequest(reimbursement);
		ReimbursementPojo expectedResult = new ReimbursementPojo (51, 1, "Pending", 123.50f, "test img", null, "" );
		assertEquals(actualResult, expectedResult);
	}
	@Test 
	public void TestEmployeeApproved() {
		ReimbursementPojo reimbursement = new ReimbursementPojo(1, 1, "Pending",  123.50f, "test img", null, "Approved");
		when(reimbursementDao.findById(1)).thenReturn(Optional.of(new ReimbursementEntity(51, 1, "Pending",  123.50f, "test img", null, "Approved")));
		ReimbursementPojo actualResult = reimbursementService.employeeRequest(reimbursement);
		ReimbursementPojo expectedResult = new ReimbursementPojo (51, 1, "Pending", 123.50f, "test img", null, "" );
		assertEquals(actualResult, expectedResult);
	}
	

	@Test 
	public void TestManagerFetchEmployeeReimbursement() {
		ReimbursementPojo reimbursement = new ReimbursementPojo(1, 1, "Pending",  123.50f, "test img", null, "Approved");
		when(reimbursementDao.findById(1)).thenReturn(Optional.of(new ReimbursementEntity(51, 1, "Pending",  123.50f, "test img", null, "Approved")));
		ReimbursementPojo actualResult = reimbursementService.employeeRequest(reimbursement);
		ReimbursementPojo expectedResult = new ReimbursementPojo (51, 1, "Pending", 123.50f, "test img", null, "" );
		assertEquals(actualResult, expectedResult);
		
	}

	@Test 
	public void TestFetchAllDenied() {
		List<ReimbursementEntity>allDenied = new ArrayList<ReimbursementEntity>();
		ReimbursementEntity reim = new ReimbursementEntity(1, 1, "RESOLVED",  123.50f, "test img", null, "Approved");
		ReimbursementEntity reim2 = new ReimbursementEntity(2, 1, "Pending",  123.50f, "test img", null, "Denied");
		ReimbursementEntity reim3 = new ReimbursementEntity(3, 1, "Pending",  123.50f, "test img", null, "Denied");
		allDenied.add(reim2);
		allDenied.add(reim);
		allDenied.add(reim3);		
		List<ReimbursementPojo>allDenied2 = new ArrayList<ReimbursementPojo>();
		ReimbursementPojo reim4 = new ReimbursementPojo(2, 1, "Pending",  123.50f, "test img", null, "Denied");
		ReimbursementPojo reim5 = new ReimbursementPojo(3, 1, "Pending",  123.50f, "test img", null, "Denied");
		allDenied2.add(reim4);
		allDenied2.add(reim5);
		when(reimbursementDao.findAllByStatus("Denied")).thenReturn(allDenied);
		List<ReimbursementPojo> actualResult = reimbursementService.fetchAllDenied();
		List <ReimbursementPojo> expectedResult = allDenied2;
		assertEquals(actualResult, expectedResult);
	
	}
	@Test 
	public void TestFetchAllApproved() {
		ReimbursementPojo reimbursement = new ReimbursementPojo(1, 1, "Pending",  123.50f, "test img", null, "Approved");
		when(reimbursementDao.findById(1)).thenReturn(Optional.of(new ReimbursementEntity(51, 1, "Pending",  123.50f, "test img", null, "Approved")));
		ReimbursementPojo actualResult = reimbursementService.employeeRequest(reimbursement);
		ReimbursementPojo expectedResult = new ReimbursementPojo (51, 1, "Pending", 123.50f, "test img", null, "" );
		assertEquals(actualResult, expectedResult);
		
	}
	@Test 
	public void TestFetchAllPending() {
		ReimbursementPojo reimbursement = new ReimbursementPojo(1, 1, "Pending",  123.50f, "test img", null, "Approved");
		when(reimbursementDao.findById(1)).thenReturn(Optional.of(new ReimbursementEntity(51, 1, "Pending",  123.50f, "test img", null, "Approved")));
		ReimbursementPojo actualResult = reimbursementService.employeeRequest(reimbursement);
		ReimbursementPojo expectedResult = new ReimbursementPojo (51, 1, "Pending", 123.50f, "test img", null, "" );
		assertEquals(actualResult, expectedResult);
	}
	@Test 
	public void TestApprove() {
		ReimbursementPojo reimbursement = new ReimbursementPojo(1, 1, "Pending",  123.50f, "test img", null, "Approved");
		when(reimbursementDao.findById(1)).thenReturn(Optional.of(new ReimbursementEntity(51, 1, "Pending",  123.50f, "test img", null, "Approved")));
		ReimbursementPojo actualResult = reimbursementService.employeeRequest(reimbursement);
		ReimbursementPojo expectedResult = new ReimbursementPojo (51, 1, "Pending", 123.50f, "test img", null, "" );
		assertEquals(actualResult, expectedResult);
	}
	@Test 
	public void TestDeny() {
		ReimbursementPojo reimbursement = new ReimbursementPojo(1, 1, "Pending",  123.50f, "test img", null, "Approved");
		when(reimbursementDao.findById(1)).thenReturn(Optional.of(new ReimbursementEntity(51, 1, "Pending",  123.50f, "test img", null, "Approved")));
		ReimbursementPojo actualResult = reimbursementService.employeeRequest(reimbursement);
		ReimbursementPojo expectedResult = new ReimbursementPojo (51, 1, "Pending", 123.50f, "test img", null, "" );
		assertEquals(actualResult, expectedResult);
	}
	}



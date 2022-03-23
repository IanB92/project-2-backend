package com.project2.project2reimbursementbackend;



import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;



import com.project2.project2reimbursementbackend.dao.EmployeeDao;
import com.project2.project2reimbursementbackend.entity.EmployeeEntity;
import com.project2.project2reimbursementbackend.service.EmployeeService;
import com.project2.project2reimbursementbackend.to.EmployeeTo;


//https://howtodoinjava.com/spring-boot2/testing/spring-boot-mockito-junit-example/

@SpringBootTest
//
//@Profile("test")
//@Configuration
@RunWith(MockitoJUnitRunner.class)
class Project2ReimbursementBackendApplicationTests {

	
	@InjectMocks
	EmployeeService employeeService;
	
	@Mock
	EmployeeDao employeeDao;
	
	@BeforeAll
	public void init() {
		MockitoAnnotations.initMocks(this);;
	}
	@Test
	public void TestEmployeeInfo() {
		EmployeeTo actualResult = employeeService.employeeInfo(1);
		EmployeeTo expectedResult = new EmployeeTo(1, "Percy", "Jackson","Camp Half Blood","777-777-7777", "sonOfPoseidon@Gmail.com", "15", "123" );
		when(employeeDao.findById(1)).thenReturn(Optional.of(new EmployeeEntity(1, "Percy", "Jackson","Camp Half Blood","777-777-7777", "sonOfPoseidon@Gmail.com", "15", "123")));
		
	
	}
	
	
	

}

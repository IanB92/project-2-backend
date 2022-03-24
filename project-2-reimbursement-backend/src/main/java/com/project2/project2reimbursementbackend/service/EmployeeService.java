package com.project2.project2reimbursementbackend.service;




import com.project2.project2reimbursementbackend.to.EmployeeTo;


public interface EmployeeService {
	EmployeeTo employeeLogin(EmployeeTo employee);

	EmployeeTo employeeInfo(int employeeId);
	
	EmployeeTo employeeUpdate(EmployeeTo employeeTo);

}

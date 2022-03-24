package com.project2.project2reimbursementbackend.to;

import java.util.Objects;

public class EmployeeTo {
	
	
	private int employeeId;
	private String employeeFirstName;
	private String employeeLastName;
	private String employeeAddress;
	private String employeeContact;	
	private String employeeEmail;
	private String employeeUsername;
	private String employeePassword;

	
	public EmployeeTo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmployeeTo(int employeeId, String employeeFirstName, String employeeLastName, 
			String employeeAddress, String employeeContact, String employeeEmail,
			String employeeUsername, String employeePassword) {
		super();
		this.employeeId = employeeId;
		this.employeeFirstName = employeeFirstName;
		this.employeeLastName = employeeLastName;
		this.employeeAddress = employeeAddress;
		this.employeeContact = employeeContact;
		this.employeeEmail = employeeEmail;
		this.employeeUsername = employeeUsername;
		this.employeePassword = employeePassword;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeFirstName() {
		return employeeFirstName;
	}
	public void setEmployeeFirstName(String employeeFirstName) {
		this.employeeFirstName = employeeFirstName;
	}
	public String getEmployeeLastName() {
		return employeeLastName;
	}
	public void setEmployeeLastName(String employeeLastName) {
		this.employeeLastName = employeeLastName;
	}
	public String getEmployeeAddress() {
		return employeeAddress;
	}
	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}
	public String getEmployeePhoneNumber() {
		return employeeContact;
	}
	public void setEmployeePhoneNumber(String employeePhoneNumber) {
		this.employeeContact = employeePhoneNumber;
	}
	public String getEmployeeEmail() {
		return employeeEmail;
	}
	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}
	public String getEmployeeUsername() {
		return employeeUsername;
	}
	public void setEmployeeUsername(String employeeUsername) {
		this.employeeUsername = employeeUsername;
	}
	public String getEmployeePassword() {
		return employeePassword;
	}
	public void setEmployeePassword(String employeePassword) {
		this.employeePassword = employeePassword;
	}

	@Override
	public String toString() {
		return "EmployeeTo [employeeId=" + employeeId + ", employeeFirstName=" + employeeFirstName
				+ ", employeeLastName=" + employeeLastName + ", employeeAddress=" + employeeAddress
				+ ", employeePhoneNumber=" + employeeContact + ", employeeEmail=" + employeeEmail
				+ ", employeeUsername=" + employeeUsername + ", employeePassword=" + employeePassword +"]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(employeeAddress, employeeContact, employeeEmail, employeeFirstName, employeeId,
				employeeLastName, employeePassword, employeeUsername);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeTo other = (EmployeeTo) obj;
		return Objects.equals(employeeAddress, other.employeeAddress)
				&& Objects.equals(employeeContact, other.employeeContact)
				&& Objects.equals(employeeEmail, other.employeeEmail)
				&& Objects.equals(employeeFirstName, other.employeeFirstName) && employeeId == other.employeeId
				&& Objects.equals(employeeLastName, other.employeeLastName)
				&& Objects.equals(employeePassword, other.employeePassword)
				&& Objects.equals(employeeUsername, other.employeeUsername);
	}

	
	
	
}

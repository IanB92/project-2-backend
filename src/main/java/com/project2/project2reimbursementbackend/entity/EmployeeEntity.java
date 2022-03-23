package com.project2.project2reimbursementbackend.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name="employee_details")
public class EmployeeEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="employee_id")
	private int employeeId;
	
	@Column(name="first_name")
	private String employeeFirstName;
	
	@Column(name="last_name")
	private String employeeLastName;
	
	@Column(name="address")
	private String employeeAddress;
	@Column(name="contact")
	private String employeeContact;
	
	@Column(name="email")
	private String employeeEmail;
	
	@Column(name="username")
	private String employeeUsername;

	@Column(name="password")
	private String employeePassword;

	public EmployeeEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public EmployeeEntity(int employeeId, String employeeFirstName, String employeeLastName, String employeeAddress,
			String employeeContact, String employeeEmail, String employeeUsername, String employeePassword) {
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

	public String getEmployeeContact() {
		return employeeContact;
	}

	public void setEmployeeContact(String employeeContact) {
		this.employeeContact = employeeContact;
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
		return "EmployeeEntity [employeeId=" + employeeId + ", employeeFirstName=" + employeeFirstName
				+ ", employeeLastName=" + employeeLastName + ", employeeAddress=" + employeeAddress
				+ ", employeePhoneNumber=" + employeeContact + ", employeeEmail=" + employeeEmail
				+ ", employeeUserName=" + employeeUsername + ", employeePassword=" + employeePassword + "]";
	}


	
	
	
}

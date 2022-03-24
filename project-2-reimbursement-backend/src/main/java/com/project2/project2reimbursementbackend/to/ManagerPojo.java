package com.project2.project2reimbursementbackend.to;

import java.util.Objects;

public class ManagerPojo {
	
	private int managerId;
	private String firstName;
	private String lastName;
	private String address;
	private String contact;
	private String email;
	private String username;
	private String password;

	
	
	public ManagerPojo(){
		super();
		
	}


	public ManagerPojo(int managerId, String firstName, String lastName, String address, String contact, String email,
			String username, String password) {
		super();
		this.managerId = managerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.contact = contact;
		this.email = email;
		this.username = username;
		this.password = password;

	}


	public int getManagerId() {
		return managerId;
	}


	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getContact() {
		return contact;
	}


	public void setContact(String contact) {
		this.contact = contact;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "ManagerPojo [managerId=" + managerId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", address=" + address + ", contact=" + contact + ", email=" + email + ", userName=" + username
				+ ", password=" + password + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(address, contact, email, firstName, lastName, managerId, password, username);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ManagerPojo other = (ManagerPojo) obj;
		return Objects.equals(address, other.address) && Objects.equals(contact, other.contact)
				&& Objects.equals(email, other.email) && Objects.equals(firstName, other.firstName)
				&& Objects.equals(lastName, other.lastName) && managerId == other.managerId
				&& Objects.equals(password, other.password) && Objects.equals(username, other.username);
	}

	
	
}

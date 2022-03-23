package com.project2.project2reimbursementbackend.exception;

public class NothingPending extends Exception{
	public String getMessage() {
		return "No Pending Customers";
	}
}

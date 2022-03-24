package com.project2.project2reimbursementbackend.exception;

public class SystemException extends Exception{
	


	@Override
	public String getMessage() {
		return "Something went wrong. Please try again!";
	}
}

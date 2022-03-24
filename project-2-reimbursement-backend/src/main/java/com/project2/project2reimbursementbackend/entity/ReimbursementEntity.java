package com.project2.project2reimbursementbackend.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;


@Entity
@Table(name="reimbursement_details")
public class ReimbursementEntity {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="reimbursement_id")
	private int reimbursementId;
	
	
	//how to name foreign key constraints
	@Column(name="employee_id")
	private int employeeId;
	
	
	@Column(name="state")
	private String state;
	
	
	@Column(name="reimbursement_amount")
	private float reimbursement_amount;
	
	@Column(name="reimbursement_reason")
	private String reimbursement_reason;
	

	@CreationTimestamp// this will create dates omg
	@Column(name="reimbursement_date")
	private Date reimbursementDate;
	
	@Column(name="status")
	private String status;
	
	public ReimbursementEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ReimbursementEntity(int reimbursementId, int employeeId, String state, float reimbursement_amount,
			String reimbursement_reason, Date reimbursementDate, String status) {
		super();
		this.reimbursementId = reimbursementId;
		this.employeeId = employeeId;
		this.state = state;
		this.reimbursement_amount = reimbursement_amount;
		this.reimbursement_reason = reimbursement_reason;
		this.reimbursementDate = reimbursementDate;
		this.status = status;

	}

	public int getReimbursementId() {
		return reimbursementId;
	}

	public void setReimbursementId(int reimbursementId) {
		this.reimbursementId = reimbursementId;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public float getReimbursement_amount() {
		return reimbursement_amount;
	}

	public void setReimbursement_amount(float reimbursement_amount) {
		this.reimbursement_amount = reimbursement_amount;
	}

	public String getReimbursement_reason() {
		return reimbursement_reason;
	}

	public void setReimbursement_reason(String reimbursement_reason) {
		this.reimbursement_reason = reimbursement_reason;
	}

	public Date getReimbursementDate() {
		return reimbursementDate;
	}

	public void setReimbursementDate(Date reimbursementDate) {
		this.reimbursementDate = reimbursementDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	

	@Override
	public String toString() {
		return "ReimbursementEntity [reimbursementId=" + reimbursementId + ", employeeId=" + employeeId + ", state="
				+ state + ", reimbursement_amount=" + reimbursement_amount + ", reimbursement_reason="
				+ reimbursement_reason + ", reimbursementDate=" + reimbursementDate + ", status=" + status +  "]";
	}

	
}

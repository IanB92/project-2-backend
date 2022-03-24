package com.project2.project2reimbursementbackend.to;

import java.util.Date;
import java.util.Objects;

public class ReimbursementPojo {
	
		private int reimbursementId;
		private int employeeId;
		private String state;
		private Float reimbursementAmount;
		private String reimbursementReason;
		private Date  reimbursementDate;
		private String status;

		public ReimbursementPojo() {
			super();
			// TODO Auto-generated constructor stub
		}
		public ReimbursementPojo(int reimbursementId, int employeeId, String state, Float reimbursementAmount,
				String reimbursementReason, Date reimbursementDate, String status) {
			super();
			this.reimbursementId = reimbursementId;
			this.employeeId = employeeId;
			this.state = state;
			this.reimbursementAmount = reimbursementAmount;
			this.reimbursementReason = reimbursementReason;
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
		public Float getReimbursementAmount() {
			return reimbursementAmount;
		}
		public void setReimbursementAmount(Float reimbursementAmount) {
			this.reimbursementAmount = reimbursementAmount;
		}
		public String getReimbursementReason() {
			return reimbursementReason;
		}
		public void setReimbursementReason(String reimbursementReason) {
			this.reimbursementReason = reimbursementReason;
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
			return "ReimbursementPojo [reimbursementId=" + reimbursementId + ", employeeId=" + employeeId + ", state="
					+ state + ", reimbursementAmount=" + reimbursementAmount + ", reimbursementReason="
					+ reimbursementReason + ", reimbursementDate=" + reimbursementDate + ", status=" + status
				 + "]";
		}
		@Override
		public int hashCode() {
			return Objects.hash(employeeId, reimbursementAmount, reimbursementDate, reimbursementId,
					reimbursementReason, state, status);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			ReimbursementPojo other = (ReimbursementPojo) obj;
			return employeeId == other.employeeId && Objects.equals(reimbursementAmount, other.reimbursementAmount)
					&& Objects.equals(reimbursementDate, other.reimbursementDate)
					&& reimbursementId == other.reimbursementId
					&& Objects.equals(reimbursementReason, other.reimbursementReason)
					&& Objects.equals(state, other.state) && Objects.equals(status, other.status);
		}
		
		
	
}
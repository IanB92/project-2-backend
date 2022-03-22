package com.project2.project2reimbursementbackend.to;

import java.util.Date;

public class ReimbursementPojo {
	
		private int reimbursementId;
		private int employeeId;
		private String state;
		private Float reimbursementAmount;
		private String reimbursementReason;
		private Date  reimbursementDate;
		private String status;
		private String imgUrl;
		public ReimbursementPojo() {
			super();
			// TODO Auto-generated constructor stub
		}
		public ReimbursementPojo(int reimbursementId, int employeeId, String state, Float reimbursementAmount,
				String reimbursementReason, Date reimbursementDate, String status, String imgUrl) {
			super();
			this.reimbursementId = reimbursementId;
			this.employeeId = employeeId;
			this.state = state;
			this.reimbursementAmount = reimbursementAmount;
			this.reimbursementReason = reimbursementReason;
			this.reimbursementDate = reimbursementDate;
			this.status = status;
			this.imgUrl = imgUrl;
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
		public String getImgUrl() {
			return imgUrl;
		}
		public void setImgUrl(String imgUrl) {
			this.imgUrl = imgUrl;
		}
		@Override
		public String toString() {
			return "ReimbursementPojo [reimbursementId=" + reimbursementId + ", employeeId=" + employeeId + ", state="
					+ state + ", reimbursementAmount=" + reimbursementAmount + ", reimbursementReason="
					+ reimbursementReason + ", reimbursementDate=" + reimbursementDate + ", status=" + status
					+ ", imgUrl=" + imgUrl + "]";
		}
	
}
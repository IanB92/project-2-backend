package service;


import java.util.List;
import exceptions.SystemException;
import transferobjects.ManagerPojo;
import transferobjects.ReimbursementPojo;

public interface ManagerService {
	
	List<ReimbursementPojo> fetchAllPending() throws SystemException;

	List<ReimbursementPojo> fetchAllResolved() throws SystemException;

	List<ReimbursementPojo> fetchAllDenied() throws SystemException;

	ReimbursementPojo approve(int pendingId) throws SystemException;

	ReimbursementPojo deny(int pendingId) throws SystemException;

	List<ReimbursementPojo> fetchEmpReimbursement(int employeeId) throws SystemException;

	ManagerPojo managerLogin(ManagerPojo manager) throws SystemException;
	

}
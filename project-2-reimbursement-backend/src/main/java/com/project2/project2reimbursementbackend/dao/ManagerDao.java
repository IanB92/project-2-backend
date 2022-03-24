package com.project2.project2reimbursementbackend.dao;



import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project2.project2reimbursementbackend.entity.ManagerEntity;




public interface ManagerDao extends JpaRepository<ManagerEntity, Integer>{


	Optional<ManagerEntity> findByUsernameAndPassword(String username, String password);




	




	
}
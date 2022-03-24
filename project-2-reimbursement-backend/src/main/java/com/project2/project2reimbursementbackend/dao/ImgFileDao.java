package com.project2.project2reimbursementbackend.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project2.project2reimbursementbackend.entity.ImgFileEntity;

public interface ImgFileDao extends JpaRepository<ImgFileEntity, String>{

}
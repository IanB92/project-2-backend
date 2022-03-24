package com.project2.project2reimbursementbackend;

import javax.annotation.Resource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.project2.project2reimbursementbackend.service.ImgFileService;

@SpringBootApplication
public class Project2ReimbursementBackendApplication {
	@Resource
	ImgFileService imgFileService;
	public static void main(String[] args) {
		SpringApplication.run(Project2ReimbursementBackendApplication.class, args);
	}


}

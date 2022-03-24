package com.project2.project2reimbursementbackend.service;
import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.util.FileSystemUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.project2.project2reimbursementbackend.dao.ImgFileDao;
import com.project2.project2reimbursementbackend.entity.ImgFileEntity;

@Service
public class ImgFileServiceImpl implements ImgFileService {
	  @Autowired
	  ImgFileDao imgFileDao;

	  public ImgFileEntity store(MultipartFile file) throws IOException {
	    String fileName = StringUtils.cleanPath(file.getOriginalFilename());
	    ImgFileEntity FileDB = new ImgFileEntity(fileName, file.getContentType(), file.getBytes());
	    return imgFileDao.save(FileDB);
	  }
	  public ImgFileEntity getFile(String id) {
	    return imgFileDao.findById(id).get();
	  }
	  
	  public Stream<ImgFileEntity> getAllFiles() {
	    return imgFileDao.findAll().stream();
	  }
	  

	}


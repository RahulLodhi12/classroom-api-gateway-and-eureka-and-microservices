package com.tcs.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.tcs.training.bean.School;
import com.tcs.training.repository.SchoolRepo;

@Service
public class SchoolService {
	@Autowired
	SchoolRepo schoolRepo;
	
	public List<School> getAllSchools() {
		return schoolRepo.findAll();
	}

	public Object getSchoolByName(String schoolName) {
		return schoolRepo.findBySchoolName(schoolName);
	}
	
	
}

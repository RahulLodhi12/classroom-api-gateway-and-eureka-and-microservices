package com.tcs.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.training.bean.School;
import com.tcs.training.repository.SchoolRepo;
import com.tcs.training.service.SchoolService;

@RestController
@RequestMapping("/microservices")
public class SchoolController {
	
	@Autowired
	SchoolService schoolService;
	
	@GetMapping("/schools")
	public List<School> getAllSchools() {
		return schoolService.getAllSchools();
	}
	
	@GetMapping("/schools/{schoolName}")
	public Object getSchoolByName(@PathVariable String schoolName) {
		return schoolService.getSchoolByName(schoolName);
	}
	
	
}

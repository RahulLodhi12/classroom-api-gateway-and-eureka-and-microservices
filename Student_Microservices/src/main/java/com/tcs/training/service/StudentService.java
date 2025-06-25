package com.tcs.training.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import com.tcs.training.bean.Student;
import com.tcs.training.repository.StudentRepo;

@Service
public class StudentService {
	
	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	StudentRepo studentRepo;
	
	public List<Student> getAllStudents() {
		return studentRepo.findAll();
	}
	
	public Optional<Student> getStudentById(Integer id) {
		return studentRepo.findById(id);
	}
	
	public String getSchoolLocation(String schoolName) {
		String url = "http://localhost:8085/microservices/schools/DAV";
		
		return restTemplate.getForObject(url, String.class);
	}
}

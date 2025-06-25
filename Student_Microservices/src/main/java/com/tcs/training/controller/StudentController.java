package com.tcs.training.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.training.bean.Student;
import com.tcs.training.repository.StudentRepo;
import com.tcs.training.service.StudentService;

@RestController
@RequestMapping("/microservices")
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@GetMapping("/students")
	public List<Student> getAllStudents() {
		return studentService.getAllStudents();
	}
	
	@GetMapping("/students/id")
	public Optional<Student> getStudentById(@PathVariable Integer id) {
		return studentService.getStudentById(id);
	}
	
	@GetMapping("/students/{name}")
	public String getSchoolLocation(String name) {
		return studentService.getSchoolLocation(name);
	}
	
}

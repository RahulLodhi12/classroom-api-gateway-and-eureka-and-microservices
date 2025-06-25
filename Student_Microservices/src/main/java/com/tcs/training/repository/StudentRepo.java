package com.tcs.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcs.training.bean.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

}

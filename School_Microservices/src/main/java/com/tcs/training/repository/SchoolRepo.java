package com.tcs.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcs.training.bean.School;

public interface SchoolRepo extends JpaRepository<School, Integer> {

//	Object findByName();

	Object findBySchoolName(String schoolName);

}

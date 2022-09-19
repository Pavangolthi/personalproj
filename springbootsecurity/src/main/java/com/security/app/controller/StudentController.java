package com.security.app.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.security.app.entity.Student;
import com.security.app.repository.IStudentRepository;


@RestController
@RequestMapping("/students")
public class StudentController {
	
	@Autowired
	private IStudentRepository iStudentRepository;
	
	@GetMapping(path="/{id}")
	public Student getStudent(@PathVariable("id") int studentId) {
		return iStudentRepository.findById(studentId).get();
	}
}

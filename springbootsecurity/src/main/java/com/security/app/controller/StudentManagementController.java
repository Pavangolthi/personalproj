package com.security.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.security.app.entity.Student;
import com.security.app.repository.IStudentRepository;

@RestController
@RequestMapping("management/api/v1/students")
public class StudentManagementController {

	@Autowired
	private IStudentRepository iStudentRepository;
	
	@GetMapping
	private List<Student> getAllStudents(){
		return iStudentRepository.findAll();
	}
	
	@PostMapping
	private void addStudent(@RequestBody Student student) {
		System.out.println(student);
	}
	
	@DeleteMapping(path= "/{id}")
	private void deleteStudent(@PathVariable("id") int id) {
		System.out.println(id);
	}
	
	@PutMapping(path="/{id}")
	private void updateStudent(@PathVariable("id") int id, @RequestBody Student student) {
		System.out.println(String.format("%s %s", id, student));
	}
	
}


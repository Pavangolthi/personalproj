package com.security.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.security.app.entity.Student;

public interface IStudentRepository extends JpaRepository<Student, Integer>{

}

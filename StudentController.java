package com.vp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vp.model.Student;
import com.vp.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@GetMapping("/students")
	public List<Student> getStudents(){
		return studentService.getAllStudent();
	}
	
	@PostMapping("/student")
	public void insertStudent(@RequestBody Student student) {
		studentService.saveStudent(student);
	}
	
}
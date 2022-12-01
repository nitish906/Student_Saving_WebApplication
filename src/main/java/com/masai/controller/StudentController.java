package com.masai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.entity.Student;
import com.masai.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	
	@GetMapping("/students")
	public ResponseEntity<Student>registerStudentHandler(@RequestBody Student student){
		
		Student saveStudent= studentService.saveStudent(student);
		
		return new ResponseEntity<Student>(saveStudent,HttpStatus.CREATED);
		
	}

}

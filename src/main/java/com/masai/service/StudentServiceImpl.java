package com.masai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.entity.Student;
import com.masai.repositery.StudentDao;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentDao dao;

	@Override
	public Student saveStudent(Student student) {
		
		
	   Student saveStudent=dao.save(student);
		
		return saveStudent;
	}

}

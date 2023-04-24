package com.pro2.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.pro2.demo.model.Student;
import com.pro2.demo.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository studentservice;
	
	public List<Student> getAllStudents()
	{
		List<Student>studentList=studentservice.findAll();
		return studentList;
	}
	
	public Student saveStudent(Student s) {
		return studentservice.save(s);
	}
	
	public void deleteStudent(int s) {
		studentservice.deleteById(s);
	}
}

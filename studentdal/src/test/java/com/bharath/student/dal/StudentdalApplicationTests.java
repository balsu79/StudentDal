package com.bharath.student.dal;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.bharath.student.dal.entities.Student;
import com.bharath.student.dal.repos.StudentRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentdalApplicationTests {

	@Autowired
	private StudentRepository studentRepository;

	@Test
	public void testCreateStudent() {
		Student student = new Student();
		student.setName("John");
		student.setCourse("Java Web Services");
		student.setFees(10.00d);
		studentRepository.save(student);
	}
	
	@Test
	public void testFindStudentById() {
		Optional<Student> student = studentRepository.findById(1l);
		System.out.println(student);
	}

	@Test
	public void testUpdateStudentById() {
		Optional<Student> student = studentRepository.findById(1l);
//		student.setFees(40.00d);
//		studentRepository.save(student);
	}
}

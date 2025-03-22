package com.demo.hiber.controller;

import java.util.ArrayList;
import java.util.List;

import com.demo.hiber.dao.StudentDao;
import com.demo.hiber.dto.Course;
import com.demo.hiber.dto.Student;

public class StudentController {
 
	public static void main(String[] args) {
		Student student = new Student();
		student.setName("Janu");
		student.setLocation("Hyd");
		
		Student student1 = new Student();
		student1.setName("virat");
		student1.setLocation("Bangalore");
		
		Course course = new Course();
		course.setCourse("Java");
		course.setFees(30000.01);
		
		Course course1 = new Course();
		course1.setCourse("Python");
		course1.setFees(25000.02);
		
		List<Course> courses = new ArrayList<>();
		courses.add(course);
		courses.add(course1);
	
		student.setCourse(courses);
		student1.setCourse(courses);
		
		List<Student> students = new ArrayList<>();
		students.add(student);
		students.add(student1);
		
		course.setStudent(students);
		course1.setStudent(students);
		
		StudentDao dao = new StudentDao();
		dao.saveStudent(student);
		dao.saveStudent(student1);
		
	}
}

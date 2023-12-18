package com.School.Dao;

import java.util.List;

import com.School.Entity.DtoStudent;
import com.School.Entity.Student;

public interface Dao {


	public List<Student> showStudent();
	
	public String insertStudentData(DtoStudent dtostudent);
	
	public Student  giveStudentObject(int id);
	
	public void updateStudent(DtoStudent dtostudent);
	public void delete_student(int id);
	
}

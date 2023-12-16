package com.School.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.School.Dao.DaoImplementation;
import com.School.Entity.DtoStudent;
import com.School.Entity.Student;

@Component
public class ServiceImp implements Service {
	
	@Autowired
	DaoImplementation di;

	@Override
	public List<Student> showStudent() {
		
		List<Student> showStudent = di.showStudent();
		return showStudent;
	}

	@Override
	public String insertStudentData(DtoStudent dtostudent) {

		String insertStudentData = di.insertStudentData(dtostudent);
		return insertStudentData;
	}

	@Override
	public Student giveStudentObject(int id) {
		
		Student giveStudentObject = di.giveStudentObject(id);
		return giveStudentObject;
	}

}

package com.School.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.School.Entity.DtoStudent;
import com.School.Entity.Student;
import com.School.Entity.StudentRowMapper;



@Configuration
@Component
public class DaoImplementation implements Dao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Student> showStudent() {
		String query = "SELECT * FROM students";

		List<Student> StudentList = jdbcTemplate.query(query, new StudentRowMapper());

		return StudentList;
	}

	@Override
	public String insertStudentData(DtoStudent dtostudent) {
		String query="insert into students (name , mobile , country) values (?,?,?)";
		Object[] data= {dtostudent.getName(),dtostudent.getMobile(),dtostudent.getCountry()};
		String name="Null";
	
		jdbcTemplate.update(query, data);
		name=dtostudent.getName();
		return name;
	}

	@Override
	public Student giveStudentObject(int id) {
		
		
		String query="select * from students where id = ?";
		Student updateStudentData = jdbcTemplate.queryForObject(query, new StudentRowMapper(), id);
	
		return updateStudentData;
	}

	@Override
	public void updateStudent(DtoStudent dtostudent) {
		
		String query="UPDATE STUDENTS SET name=?, mobile=?, country=? WHERE id=?";
		jdbcTemplate.update(query,dtostudent.getName(),dtostudent.getMobile(),dtostudent.getCountry(),dtostudent.getId());
	}

	


	}




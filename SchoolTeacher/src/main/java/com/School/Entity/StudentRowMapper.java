package com.School.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class StudentRowMapper implements RowMapper<Student> {

	

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Student  studentapi = new Student();
		
		studentapi.setId(rs.getInt(1));
		studentapi.setName(rs.getNString(2));
		studentapi.setMobile(rs.getLong(3));
		studentapi.setCountry(rs.getString(4));
		
		
		
		return studentapi;
	}

}

package com.School.Controller;


import java.util.ArrayList;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.School.Dao.DaoImplementation;
import com.School.Entity.DtoStudent;
import com.School.Entity.Student;
import com.School.Entity.StudentRowMapper;
import com.School.Service.ServiceImp;


@Controller
public class MyController {
	
	
	@Autowired
	DaoImplementation daoimp;
	
	@Autowired
	ServiceImp serviceImp;
	
	
	@GetMapping("/b")
	public String b()
	{
		return "b";
	}
	
//	Github test
	@RequestMapping(value ="/showstudent", method = RequestMethod.GET)
	public String a(Model m)
	{
//		List<Student> showStudent = daoimp.showStudent();
		List<Student> showStudent = serviceImp.showStudent();
//		for(Student temp: showStudent)
//		{
//			System.out.println(temp);
//		}
		m.addAttribute("showStudent", showStudent);
		return "showstudent";
	}
	
	@RequestMapping("/add_data")
	public String addData(@ModelAttribute("studentData") DtoStudent dtostudent,Model model)
	{
		
		return "addData";
	}
	
	@RequestMapping("update_student")
	public String updateStudent(@RequestParam("id") int id,   @ModelAttribute("studentData") DtoStudent dtostudent, Model model)
	{
		Student giveStudentObject = serviceImp.giveStudentObject(id);
		System.out.println(giveStudentObject);
		
		model.addAttribute("studentData", giveStudentObject);
//		this above line do same as these 4 lines below
//		dtostudent.setId(giveStudentObject.getId());
//		dtostudent.setName(giveStudentObject.getName());
//		dtostudent.setMobile(giveStudentObject.getMobile());
//		dtostudent.setCountry(giveStudentObject.getCountry());
		return "addData";
	}
	
	
	String newstudent;
	@PostMapping("/newstudentadded")// dtostudent mei data binding hogai hai hai hum ny url k through isme data bind krdiya hai from form
	public String newstudentadded(DtoStudent dtostudent)
	{
		if(dtostudent.getId()==0)
		{
			serviceImp.insertStudentData(dtostudent);
		}
		
		else
		{
			serviceImp.updateStudent(dtostudent);
		}
		
		newstudent=dtostudent.getName();
		return "redirect:/thankyou";
		
	}
	
	@GetMapping("thankyou")
	public String greet(Model m)
	{
		m.addAttribute("newstudent", newstudent);
		return "thankyou";
	}
	
	@RequestMapping("delete_student")
	public String delete_Student(@RequestParam("id") int id)
	{
		serviceImp.delete_student(id);
		return "redirect:/showstudent";
	}
	
}

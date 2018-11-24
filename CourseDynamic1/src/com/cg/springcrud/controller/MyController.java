package com.cg.springcrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.springcrud.dto.Course;
import com.cg.springcrud.service.ICourseService;


@Controller
public class MyController {
	@Autowired
	ICourseService service;
	
	
	@RequestMapping(value="coursedetails")
	public ModelAndView getAll(){
		
		List<Course> courses=service.display();
		return new ModelAndView("coursedetails","temp",courses);
		
	}
	

	
	@RequestMapping(value="success")
	public String success(){
		return "success";
	}

}

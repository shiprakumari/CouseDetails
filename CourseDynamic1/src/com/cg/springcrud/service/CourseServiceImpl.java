package com.cg.springcrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.springcrud.dao.ICourseDao;
import com.cg.springcrud.dto.Course;
@Service("service")
public class CourseServiceImpl implements ICourseService{
@Autowired
 ICourseDao dao;
	@Override
	public List<Course> display() {
	
		return dao.display();
	}

}

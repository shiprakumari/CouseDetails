package com.cg.springcrud.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cg.springcrud.dto.Course;
@Repository("dao")
public class CourseDaoImpl implements ICourseDao {
@PersistenceContext
EntityManager entity;
	@Override
	public List<Course> display() {

 	   Query query = entity.createQuery("SELECT c from Course c");
      
       
		List<Course> courses=query.getResultList();
        return courses;
        
		
	}
	
	

}

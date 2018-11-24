package com.cg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cg.dto.Employee;


@Repository("employeeDAO")
public class EmployeeDAOImpl implements IEmployeeDAO {
	
	@PersistenceContext
	EntityManager em;
	
	
	

	@Override
	public int addEmployeeData(Employee employee) {
		// TODO Auto-generated method stub
		
		em.persist(employee);
		em.flush();
		
		return employee.getEmpId();
	}

	@Override
	public List<Employee> showAllEmployee() {
	Query queryone= em.createQuery("FROM Employee");
	List<Employee> myList = queryone.getResultList();
		return myList;
	}

	@Override
	public void deleteEmployee(int empId) {
		Query querytwo = em.createQuery("DELETE FROM Employee WHERE empId=:eid");
		querytwo.setParameter("eid", empId);
		querytwo.executeUpdate();
		
		
	}

	@Override
	public boolean updateEmployee(Employee employee) {
		try{
			em.merge(employee);
			em.flush();
			return true;
		}
		catch(Exception e){
			return false;
		}
	/*	Query querythree = em.createQuery("UPDATE  Employee e SET e.empName,empSalary,e.empDesignation WHERE e.empId=:eid");
		querythree.executeUpdate();
		return employee;
		*/
		
	}

	@Override
	public Employee searchEmployee(int empId) {
		Employee employee=em.find(Employee.class, empId);
		return employee;
	}

	
	/*Query queryfour = em.createQuery("SELECT e FROM Employee e WHERE e.empId=:eid");
	queryfour.setParameter("eid", empId);
	Employee employee = (Employee) queryfour.getSingleResult();*/
}

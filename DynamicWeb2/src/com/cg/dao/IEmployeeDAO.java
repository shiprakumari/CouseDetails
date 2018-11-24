package com.cg.dao;

import java.util.List;

import com.cg.dto.Employee;

public interface IEmployeeDAO {
	
	
	public int addEmployeeData(Employee employee);
	public List<Employee> showAllEmployee();
	public void deleteEmployee(int empId);
	public boolean updateEmployee(Employee employee);
	public Employee  searchEmployee(int id);
}

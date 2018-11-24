package com.cg.service;

import java.util.List;

import com.cg.dto.Employee;

public interface IEmployeeService {
	public int addEmployeeData(Employee employee);
	public List<Employee> showAllEmployee();
	public void deleteEmployee(int empId);
	public boolean updateEmployee(Employee employee);
	public Employee  searchEmployee(int empId);
	

}

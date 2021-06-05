package com.binh.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.binh.model.Employee;

public interface EmployeeService {
	
	List<Employee> getAllEmployees();
	
	void saveEmployee(Employee e);
	
	Employee getEmployeeById(long id);
	
	void deleteEmployeeById(long id);
	
	Page < Employee > findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);

}

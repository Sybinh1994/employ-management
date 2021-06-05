package com.binh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.binh.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}

package com.ems;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ems.entity.Employee;

@Service
public interface EmployeeService {

	Employee saveEmp(Employee emp);

	List<Employee> employees();

}

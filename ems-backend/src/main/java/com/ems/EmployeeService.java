package com.ems;

import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ems.entity.Employee;

@Service
public interface EmployeeService {

	Employee saveEmp(Employee emp);

	List<Employee> employees();

	Employee getEmpById(Long id);

	Map<String, String> deleteById(Long id);

	Employee updateEmp(Employee emp);

}

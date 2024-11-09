package com.ems;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ems.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeDao dao;
	
	@Override
	public Employee saveEmp(Employee emp) {
		return dao.save(emp);
	}
	@Override
	public List<Employee> employees() {
		return (List<Employee>) dao.findAll();
	}
	@Override
	public Employee getEmpById(Long id) {
		Optional<Employee> findById = dao.findById(id);
		if(findById.isEmpty()) {
			System.out.println("DAta Not Found!");
			return null;
		}
		else {
			return findById.get();
		}
	}

}

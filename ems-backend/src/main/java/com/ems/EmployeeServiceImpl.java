package com.ems;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ems.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

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
		if (findById.isEmpty()) {
			System.out.println("DAta Not Found!");
			return null;
		} else {
			return findById.get();
		}
	}

	@Override
	public Map<String, String> deleteById(Long id) {
		dao.deleteById(id);
		Map<String, String> res = new HashMap<>();
		res.put("status", "Delee Successfully ID :" + id);
		return res;
	}

	@Override
	public Employee updateEmp(Employee emp) {
		Optional<Employee> findEmpById = dao.findById(emp.getId());
		if (findEmpById.isEmpty()) {
			System.out.println("Data Not Found!");
			return null;
		} else {
			Employee existEmp = findEmpById.get();
			existEmp.setFirstName(emp.getFirstName());
			existEmp.setLastName(emp.getLastName());
			existEmp.setMail(emp.getMail());
			existEmp.setMobile(emp.getMobile());
			return dao.save(existEmp);
		}
	}

}

package com.ems;

import java.util.List;
import java.util.Map;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ems.entity.Employee;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/emp")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("/save")
	public Employee saveEmp(@RequestBody Employee emp) {
		return employeeService.saveEmp(emp);
	}
	
	@GetMapping("/empAll")
	public List<Employee> employees(){
		return employeeService.employees();
	}
	
	@GetMapping("/empById/{id}")
	public Employee getEmpById(@PathVariable Long id) {
		return employeeService.getEmpById(id);
	}
	
	@DeleteMapping("/deleteById/{id}")
	public Map<String, String> deleteById(@PathVariable Long id) {
		return employeeService.deleteById(id);
	}
}

package com.ems;

import org.springframework.data.repository.CrudRepository;

import com.ems.entity.Employee;

public interface EmployeeDao extends CrudRepository<Employee, Long>{

}

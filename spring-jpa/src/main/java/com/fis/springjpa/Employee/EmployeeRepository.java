package com.fis.springjpa.Employee;

import org.springframework.data.repository.CrudRepository;

import com.fis.springjpa.User;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}

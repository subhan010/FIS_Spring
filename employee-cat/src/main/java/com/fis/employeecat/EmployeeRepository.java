package com.fis.employeecat;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;



@RepositoryRestResource
interface EmployeeRepository extends JpaRepository<Employee, Long> {}
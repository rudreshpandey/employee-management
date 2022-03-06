package com.ems.employeemanagement.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ems.employeemanagement.model.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee,Long> {

}

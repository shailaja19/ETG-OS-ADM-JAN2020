package com.sonata.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sonata.Model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}

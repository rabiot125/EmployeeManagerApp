package com.root.EmployeeManager.repository;

import com.root.EmployeeManager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee,Long > {

 Employee deleteEmployeeById(Long id);

    Optional<Employee> findEmployeeById(Long id);
}

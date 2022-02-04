package com.root.EmployeeManager.service;

import com.root.EmployeeManager.exceptions.UserNotFoundException;
import com.root.EmployeeManager.model.Employee;
import com.root.EmployeeManager.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository){
        this.employeeRepository=employeeRepository;
    }
    public Employee addEmployee(Employee employee){
        return employeeRepository.save(employee);
    }
    public List<Employee>findAllEmployees(){
        return employeeRepository.findAll();
    }
    public Employee updateEmployee(Employee employee){
        return employeeRepository.save(employee);
    }
    public Employee deleteEmployee(Long id){
        return employeeRepository.deleteEmployeeById(id);
    }
    public Employee findEmployeeById(Long id){
        return employeeRepository.findEmployeeById(id)
                .orElseThrow(()->new UserNotFoundException("User by id "+ id +" was not found"));
    }

}

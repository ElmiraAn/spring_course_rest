package com.elmiraantipina.spring.rest.service;

import com.elmiraantipina.spring.rest.entity.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> getAllEmployees();//название такое же, как в классе DAO

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    public void deleteEmployee(int id);
}

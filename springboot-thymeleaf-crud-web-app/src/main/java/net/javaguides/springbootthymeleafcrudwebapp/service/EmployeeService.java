package net.javaguides.springbootthymeleafcrudwebapp.service;

import net.javaguides.springbootthymeleafcrudwebapp.model.Employee;
import org.springframework.stereotype.Service;


import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();

    void saveEmployees(Employee employee);

    Employee getEmployeeById(long id);
    void deleteEmployeeById(long id);
}


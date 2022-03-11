package net.javaguides.springbootthymeleafcrudwebapp.service;

import net.javaguides.springbootthymeleafcrudwebapp.model.Employee;
import org.springframework.stereotype.Service;


import java.util.List;


@Service
public interface EmployeeService {
    List<Employee> getAllEmployees();
}

package net.javaguides.springbootthymeleafcrudwebapp.service;

import net.javaguides.springbootthymeleafcrudwebapp.model.Employee;
import net.javaguides.springbootthymeleafcrudwebapp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeManager implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public void saveEmployees(Employee employee) {
       this.employeeRepository.save(employee);
    }

    @Override
    public Employee getEmployeeById(long id) {
       Optional<Employee> optional=employeeRepository.findById(id);
       Employee employee=null;
       if (optional.isPresent()){
           employee=optional.get();
       }
       else{
           throw new RuntimeException("Employee not found for id :: "+id);
       }
       return employee;
    }

    @Override
    public void deleteEmployeeById(long id) {
        this.employeeRepository.deleteById(id);
    }


}

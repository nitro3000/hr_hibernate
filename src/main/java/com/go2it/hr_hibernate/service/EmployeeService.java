package com.go2it.hr_hibernate.service;

import com.go2it.hr_hibernate.entity.Department;
import com.go2it.hr_hibernate.entity.Employee;
import com.go2it.hr_hibernate.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmployeeService implements IEmployeeService{
    @Autowired
    private EmployeeRepository employeeRepository;


    @Override
    public Employee findById(int user_id) {
        return employeeRepository.findById (user_id);
    }

    @Override
    public Employee findByUsername(String username) {
        return employeeRepository.findByUsername ("username");
    }

    @Override
    public Employee findByMail(String email) {
        return employeeRepository.findByMail ("email");
    }
    @Transactional
    public void save(Employee employee){
        employeeRepository.save (employee);

    }
}

package com.go2it.hr_hibernate.repository;

import com.go2it.hr_hibernate.entity.Employee;

public interface IEmployeeRepository {

    public Employee findById(int user_id);

    public Employee findByUsername(String username);

    public Employee findByMail(String email);

    public void save(Employee employee);

}

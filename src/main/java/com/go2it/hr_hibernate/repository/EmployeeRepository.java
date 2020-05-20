package com.go2it.hr_hibernate.repository;

import com.go2it.hr_hibernate.entity.Employee;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class EmployeeRepository implements IEmployeeRepository {
    @PersistenceContext
    private EntityManager em;

    @Override
    public Employee findById(int user_id) {
        Employee employee = em.find (Employee.class, user_id);
        return employee;
    }

    @Override
    public Employee findByUsername(String username) {
        Employee employee = em.find (Employee.class, username);
        return employee;

    }

    @Override
    public Employee findByMail(String email) {
        Employee employee = em.find (Employee.class, email);
        return employee;

    }

    @Override
    public void save(Employee employee) {
        em.persist (employee);
    }
}

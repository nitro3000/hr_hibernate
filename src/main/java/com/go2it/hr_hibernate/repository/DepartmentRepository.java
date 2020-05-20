package com.go2it.hr_hibernate.repository;

import com.go2it.hr_hibernate.entity.Department;
import com.go2it.hr_hibernate.entity.Employee;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class DepartmentRepository implements IDepartmentRepository {
    @PersistenceContext
    private EntityManager em;

    @Override
    public Department findById(int department_id) {
        Department department = em.find (Department.class, department_id);
        return department;
    }
    @Override
    public Department findByDepartmentName(String department_name) {
        Department department = em.find (Department.class, department_name);
        return department;
    }
    @Override
    public void save(Department department) {
        em.persist (department);

    }
}

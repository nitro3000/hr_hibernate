package com.go2it.hr_hibernate.repository;

import com.go2it.hr_hibernate.entity.Department;
import com.go2it.hr_hibernate.entity.Employee;

public interface IDepartmentRepository {

    public Department findById(int department_id);

    public Department findByDepartmentName(String department_name);

    public void save(Department department);

}

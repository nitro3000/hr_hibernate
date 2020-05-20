package com.go2it.hr_hibernate.service;

import com.go2it.hr_hibernate.entity.Department;

public interface IDepartmentService {
    public Department findById(int department_id);

    public Department findByDepartmentName(String department_name);

    public void save(Department department);
}

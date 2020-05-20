package com.go2it.hr_hibernate.service;

import com.go2it.hr_hibernate.entity.Department;
import com.go2it.hr_hibernate.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DepartmentService implements IDepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    @Transactional
    public  void save(Department department){
        departmentRepository.save (department);
    }
    public Department findById(int department_id){
        return departmentRepository.findById (department_id);
    }
    public Department findByDepartmentName(String department_name){
        return departmentRepository.findByDepartmentName (department_name);
    }

}

package com.go2it.hr_hibernate.entity;

import javax.persistence.*;
import java.util.List;

@Entity(name = "department")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int department_id;
    private String department_name;
    private int phone;


    public Department() {
    }
    public int getDepartment_id() {
        return department_id;
    }
    public void setDepartment_id(int department_id) {
        this.department_id = department_id;
    }
    public String getDepartment_name() {
        return department_name;
    }
    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }
    public int getPhone() {
        return phone;
    }
    public void setPhone(int phone) {
        this.phone = phone;
    }


    @Override
    public String toString() {
        return "Department{" +
                "department_id=" + department_id +
                ", department_name='" + department_name + '\'' +
                ", phone=" + phone +
                '}';
    }
}

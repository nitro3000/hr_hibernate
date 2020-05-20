package com.go2it.hr_hibernate;

import com.go2it.hr_hibernate.entity.Department;
import com.go2it.hr_hibernate.entity.Employee;
import com.go2it.hr_hibernate.service.IDepartmentService;
import com.go2it.hr_hibernate.service.IEmployeeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//Create a pseudo employees management system that will have two tables: Employee and Department. Both starts from upper-case (!).
//There must 4 fields in each table. Insert a few records using the conventional SQL.
//Create a Java system to operate with the DB.
//Requirements:
// - system has to fetch data from SQL tables
// - clear separation of concerns
// - usage of Spring, Hibernate and logging
// - unit-tests
public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext ("beans.xml");
        IEmployeeService employeeService = context.getBean (IEmployeeService.class);
        IDepartmentService departmentService = context.getBean (IDepartmentService.class);

        Department d = new Department ();
        //d.setDepartment_id (7);
        d.setDepartment_name ("abc");
        d.setPhone (0);
        departmentService.save (d);
        System.out.println ("New Department "+d.getDepartment_name () +" successfully saved under Department_id = " + d.getDepartment_id () );

//        Employee e = new Employee ();
//        e.setUsername ("gav");
//        e.setDepartmentId (3);
//        e.setEmail ("gav@dog.ru");
//        e.setPassword ("10000005");
//        employeeService.save (e);
//        System.out.println ("New employee"+e.getUsername () + "successfully saved under User_ID = " + e.getUser_id () );

    }
}

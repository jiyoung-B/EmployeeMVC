package project.spring4.mvc.employee.service;

import project.spring4.mvc.employee.model.Employee;

import java.util.List;

public interface EmpService {

    int newEmployee(Employee emp);
    List<Employee> readEmployee();
    Employee readOneEmployee();
    int modifyEmployee(Employee emp);
    int removeEmployee(int empid);


}

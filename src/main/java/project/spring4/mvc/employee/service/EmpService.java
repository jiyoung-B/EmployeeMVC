package project.spring4.mvc.employee.service;

import project.spring4.mvc.employee.model.Employee;

import java.util.List;

public interface EmpService {

    boolean newEmployee(Employee emp);
    List<Employee> readEmployee();
    Employee readOneEmployee();
    boolean modifyEmployee(Employee emp);
    boolean removeEmployee(int empid);


}

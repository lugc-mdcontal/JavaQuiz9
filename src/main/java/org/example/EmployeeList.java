package org.example;

import java.util.List;

public class EmployeeList {
    private List<Employee> Employees;

    public List<Employee> getEmployees() {
        return Employees;
    }

    public void setEmployees(List<Employee> Employees) {
        this.Employees = Employees;
    }

    public void addEmployee(Employee employee) {
        Employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        Employees.remove(employee);
    }

    public EmployeeList(List<Employee> Employees) {
        setEmployees(Employees);
    }
}

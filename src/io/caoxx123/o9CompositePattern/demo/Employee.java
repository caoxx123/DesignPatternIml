package io.caoxx123.o9CompositePattern.demo;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private String dept;
    private int salay;
    private List<Employee> Employees;

    public Employee(String name, String dept, int salay) {
        this.name = name;
        this.dept = dept;
        this.salay = salay;
        Employees=new ArrayList<Employee>();
    }

    public List<Employee> getEmployees() {
        return Employees;
    }

    public void add(Employee employee) {
        Employees.add(employee);
    }

    public void remove(Employee employee) {
        Employees.remove(employee);
    }

    @Override
    public String toString() {
        return "name is "+this.name+" dept is"+this.dept+"salay is"+this.salay;
    }
}

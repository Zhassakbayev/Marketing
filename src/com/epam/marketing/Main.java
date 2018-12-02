package com.epam.marketing;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Employee director = new Employee("director");
        Employee employee1 = new Employee("employee1");
        Employee employee2 = new Employee("employee2");
        Employee employee3 = new Employee("employee3");
        Employee employee4 = new Employee("employee4");

        director.addEmployee(employee2);
        director.addEmployee(employee1);
        employee1.addEmployee(employee3);
        employee1.addEmployee(employee4);
        Map<Integer, Employee> employeeMap = new HashMap<>();
        employeeMap.put(director.getId(), director);
        employeeMap.put(employee1.getId(), employee1);
        employeeMap.put(employee2.getId(), employee2);
        employeeMap.put(employee3.getId(), employee3);
        employeeMap.put(employee4.getId(), employee4);
    }

}

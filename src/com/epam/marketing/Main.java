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
        Employee employee5 = new Employee("employee5");
        Employee employee6 = new Employee("employee6");
        Employee employee7 = new Employee("employee7");
        Employee employee8 = new Employee("employee8");
        Employee employee9 = new Employee("employee9");
        Employee employee10 = new Employee("employee10");
        Employee employee11 = new Employee("employee11");
        Employee employee12 = new Employee("employee12");
        Employee employee13 = new Employee("employee13");
        Employee employee14 = new Employee("employee14");
        Employee employee15 = new Employee("employee15");
        Employee employee16 = new Employee("employee16");
        Employee employee17 = new Employee("employee17");
        Employee employee18 = new Employee("employee18");
        Employee employee19 = new Employee("employee19");
        Employee employee20 = new Employee("employee20");


        director.addEmployee(employee2);
        director.addEmployee(employee1);

        employee1.addEmployee(employee3);
        employee1.addEmployee(employee4);
        employee2.addEmployee(employee5);
        employee2.addEmployee(employee6);

        employee3.addEmployee(employee7);
        employee3.addEmployee(employee8);
        employee4.addEmployee(employee9);
        employee4.addEmployee(employee10);

        employee5.addEmployee(employee11);
        employee5.addEmployee(employee12);
        employee6.addEmployee(employee13);
        employee6.addEmployee(employee14);

        employee7.addEmployee(employee15);
        employee7.addEmployee(employee16);
        employee8.addEmployee(employee17);
        employee8.addEmployee(employee18);

        employee9.addEmployee(employee19);
        employee10.addEmployee(employee20);


        Map<Integer, Employee> employeeMap = new HashMap<>();
        employeeMap.put(director.getId(), director);
        employeeMap.put(employee1.getId(), employee1);
        employeeMap.put(employee2.getId(), employee2);
        employeeMap.put(employee3.getId(), employee3);
        employeeMap.put(employee4.getId(), employee4);
        employeeMap.put(employee5.getId(), employee5);
        employeeMap.put(employee6.getId(), employee6);
        employeeMap.put(employee7.getId(), employee7);
        employeeMap.put(employee8.getId(), employee8);
        employeeMap.put(employee9.getId(), employee9);
        employeeMap.put(employee10.getId(), employee10);
        employeeMap.put(employee11.getId(), employee11);
        employeeMap.put(employee12.getId(), employee12);
        employeeMap.put(employee13.getId(), employee13);
        employeeMap.put(employee14.getId(), employee14);
        employeeMap.put(employee15.getId(), employee15);
        employeeMap.put(employee16.getId(), employee16);
        employeeMap.put(employee17.getId(), employee17);
        employeeMap.put(employee18.getId(), employee18);
        employeeMap.put(employee19.getId(), employee19);
        employeeMap.put(employee20.getId(), employee20);

//        director.printChildren();
//        director.printAllChildren();

//        EmployeeMap.printParents(employee20,employeeMap);
        EmployeeMap.printChildren(employee3,employeeMap);

    }

}

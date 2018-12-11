package com.epam.marketing;

import java.util.HashMap;
import java.util.Map;

public class EmployeeMap {
    private static int number = 1;

    public static void printParents(Employee employee, Map<Integer, Employee> employeeMap) {
        System.out.println(number+") "+employee);
        number++;
        if (employee.getId()!=0){
            for (int i=0;i<employeeMap.size();i++){
              if (employee.getParentId()==employeeMap.get(i).getId()){
                  printParents(employeeMap.get(i),employeeMap);
              }
            }
        }
    }

    public static void printChildren(Employee employee,Map<Integer,Employee> employeeMap){
        System.out.println(number+") "+employee);
        number++;
        for (int i=0;i<employeeMap.size();i++){
            if (employee.getId()==employeeMap.get(i).getParentId()){
                printChildren(employeeMap.get(i),employeeMap);
            }
        }
    }
}

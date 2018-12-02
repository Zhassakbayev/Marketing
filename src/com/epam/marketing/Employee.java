package com.epam.marketing;

import java.util.*;

public class Employee {
    private String name;
    private static int counter = 0;
    private int id;
    private int parentId = 0;
    private Set<Employee> children = new HashSet<>();

    public Employee(String name) {
        this.name = name;
        this.id = counter++;
    }

    public int getId() {
        return id;
    }

    public int getParentId() {
        return parentId;
    }

    public Set<Employee> getChildren() {
        return children;
    }

    public void addEmployee(Employee employee) {
        children.add(employee);
        employee.parentId = this.id;
    }

    public void printChildren() {
        System.out.println(this);
        int numberOfChildren = 1;
        for (Employee children : children) {
            System.out.println("\t" + numberOfChildren + ") " + children);
            numberOfChildren++;
        }
    }

    public void printAllChildren() {
        System.out.println(this);
        for (Employee tempChildren : children) {
            if (children.size() != 0) {
                tempChildren.printAllChildren();
            }
        }
    }




    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                        ", id=" + id +
                        ", parentId=" + parentId;
    }
}

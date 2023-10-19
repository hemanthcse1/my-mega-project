package com.hemanth.problemsolving.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class GroupingExample {


    public static void main(String[] args) {


        List<EmployeeOne> employees = new ArrayList<>();

        employees.add(new EmployeeOne(1, "Hemanth", 31));
        employees.add(new EmployeeOne(2, "Sharad", 35));
        employees.add(new EmployeeOne(3, "Rahul", 32));
        employees.add(new EmployeeOne(4, "Kiran", 31));
        employees.add(new EmployeeOne(5, "Ashwin", 32));
        employees.add(new EmployeeOne(5, "Ashwin", 32));


       // Map<Integer, List<EmployeeOne>> employeesFilter = employees.stream().collect(Collectors.groupingBy(employeeOne -> employeeOne.getAge()));

        Map<Integer, Set<EmployeeOne>> employeesFilter = employees.stream().collect(Collectors.groupingBy(employeeOne -> employeeOne.getAge(), Collectors.toSet()));
        System.out.println(employeesFilter);

    }
}

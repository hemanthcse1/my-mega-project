package com.hemanth.interviewpractice.associativeinstream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FindSalary {

    public static void main(String[] args) {

        double THRESHOLD_SALARY = 20000;
        double DISCOUNT_VALUE = 0.9;

        List<EmployeeOne> employees = new ArrayList<>();

        EmployeeOne e1 = new EmployeeOne("IT", 25000, false);
        EmployeeOne e2 = new EmployeeOne("Finance", 15000, true);
        EmployeeOne e3 = new EmployeeOne("Infra", 18000, true);
        EmployeeOne e4 = new EmployeeOne("Developer", 35000, true);


        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);

        Double sumOfSalary = employees.stream()
                .filter(EmployeeOne::isFullTime)
                .collect(Collectors.groupingBy(EmployeeOne::getDept, Collectors.summingDouble(EmployeeOne::getSalary)))
                .entrySet().stream()
                .map(entry -> entry.getValue() > THRESHOLD_SALARY ? entry.getValue() * DISCOUNT_VALUE : entry.getValue())
                .reduce(0.0, Double::sum);

        System.out.println("Total salary expenditure -> : "+sumOfSalary);

    }


}


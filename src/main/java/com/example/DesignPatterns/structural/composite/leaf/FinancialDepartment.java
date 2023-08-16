package com.example.DesignPatterns.structural.composite.leaf;

import com.example.DesignPatterns.structural.composite.component.Department;

public class FinancialDepartment implements Department {

    Integer id ;
    String name;

    public FinancialDepartment(Integer id, String name){

        this.id = id;
        this.name = name;
    }

    @Override
    public void printDepartmentName() {

        System.out.println("Department Name is : "+getClass().getSimpleName());
    }
}

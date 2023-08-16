package com.example.DesignPatterns.structural.composite.leaf;

import com.example.DesignPatterns.structural.composite.component.Department;

public class SalesDepartment implements Department {

    Integer id ;
    String name;

    public SalesDepartment(Integer id, String name){

        this.id = id;
        this.name = name;
    }

    @Override
    public void printDepartmentName() {

        System.out.println("Department Name is : "+getClass().getSimpleName());
    }
}

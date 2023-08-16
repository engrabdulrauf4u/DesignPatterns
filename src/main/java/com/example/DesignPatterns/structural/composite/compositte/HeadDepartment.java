package com.example.DesignPatterns.structural.composite.compositte;

import com.example.DesignPatterns.structural.composite.component.Department;

import java.util.ArrayList;
import java.util.List;

public class HeadDepartment implements Department {

    Integer id ;
    String name;


    List<Department> childDepartments;

    public HeadDepartment(Integer id, String name){
        this.id = id;
        this.name = name;
        childDepartments = new ArrayList<>();
    }



    public void  addDepartment(Department department){
        childDepartments.add(department);
    }

    public void  removeDepartment(Department department){
        childDepartments.remove(department);
    }

    @Override
    public void printDepartmentName() {

        for (Department department:childDepartments)
        {
            department.printDepartmentName();
        }

    }
}

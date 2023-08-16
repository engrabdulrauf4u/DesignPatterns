package com.example.DesignPatterns.structural.composite.client;

import com.example.DesignPatterns.structural.composite.component.Department;
import com.example.DesignPatterns.structural.composite.compositte.HeadDepartment;
import com.example.DesignPatterns.structural.composite.leaf.FinancialDepartment;
import com.example.DesignPatterns.structural.composite.leaf.SalesDepartment;

/**
 * Composite pattern helps us to create structure of Objects
 * Example Ordering system(when item is ready we package into box .box can be small medium large.with in large box you can add
 *  item as well as box)
 *  it contains Component(Box ,item ),Leaf(Item),composite(is used to add and delete component/Item )
 */
public class CompositeApplication {
    public static void main(String[] args) {

        Department salesDepartment = new SalesDepartment(1,"Sales Department");

        Department financialDepartment = new FinancialDepartment(2,"Financial Department");

        HeadDepartment headDepartment = new HeadDepartment(3,"Head Department");

        headDepartment.addDepartment(salesDepartment);
        headDepartment.addDepartment(financialDepartment);

        System.out.println("before removing.........");
        headDepartment.printDepartmentName();

        headDepartment.removeDepartment(salesDepartment);
        System.out.println("After deleting departments.........");
        headDepartment.printDepartmentName();
    }
}

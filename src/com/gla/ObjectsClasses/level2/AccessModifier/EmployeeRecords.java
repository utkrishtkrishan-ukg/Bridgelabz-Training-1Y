package com.gla.ObjectsClasses.level2.AccessModifier;
import java.util.Scanner;

class Employee {
    public int employeeID;        // public
    protected String department;  // protected
    private double salary;        // private

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

class Manager extends Employee {

    void displayDetails() {
        System.out.println("\nManager Details:");
        System.out.println("Employee ID: " + employeeID);   // public
        System.out.println("Department: " + department);    // protected
        System.out.println("Salary: " + getSalary());       // private via getter
    }
}

public class EmployeeRecords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Manager mgr = new Manager();

        System.out.print("Enter Employee ID: ");
        mgr.employeeID = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Department: ");
        mgr.department = sc.nextLine();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();
        mgr.setSalary(salary);

        mgr.displayDetails();
    }
}


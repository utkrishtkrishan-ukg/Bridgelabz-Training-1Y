package com.gla.ObjectsClasses.level2.AccessModifier;
import java.util.Scanner;

class Student {
    public int rollNumber;        // public
    protected String name;        // protected
    private double CGPA;          // private

    // Setter for CGPA
    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    // Getter for CGPA
    public double getCGPA() {
        return CGPA;
    }
}

class PostgraduateStudent extends Student {

    void displayDetails() {
        System.out.println("\nPostgraduate Student Details:");
        System.out.println("Roll Number: " + rollNumber);   // public
        System.out.println("Name: " + name);               // protected
        System.out.println("CGPA: " + getCGPA());          // private via getter
    }
}

public class UniversityManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PostgraduateStudent pg = new PostgraduateStudent();

        System.out.print("Enter Roll Number: ");
        pg.rollNumber = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        pg.name = sc.nextLine();

        System.out.print("Enter CGPA: ");
        double cgpa = sc.nextDouble();
        pg.setCGPA(cgpa);

        pg.displayDetails();
    }
}

package com.gla.ObjectsClasses.level2.InstancevsClass;
import java.util.Scanner;

class Course {
    String courseName;
    int duration; // in months
    double fee;

    static String instituteName = "ABC Institute"; // Class variable

    // Constructor
    Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance Method
    void displayCourseDetails() {
        System.out.println("\nCourse Details:");
        System.out.println("Institute Name: " + instituteName);
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fee: " + fee);
    }

    // Class Method
    static void updateInstituteName(String newName) {
        instituteName = newName;
    }
}

public class CourseManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Course Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Duration (in months): ");
        int duration = sc.nextInt();

        System.out.print("Enter Course Fee: ");
        double fee = sc.nextDouble();
        sc.nextLine();

        Course c1 = new Course(name, duration, fee);
        c1.displayCourseDetails();

        System.out.print("\nEnter new Institute Name to update: ");
        String newInstitute = sc.nextLine();

        Course.updateInstituteName(newInstitute); // Updating class variable

        System.out.println("\nAfter Updating Institute Name:");
        c1.displayCourseDetails();
    }
}


package com.gla.ObjectsClasses.level2.InstancevsClass;
import java.util.Scanner;

class Vehicle {
    String ownerName;
    String vehicleType;

    static double registrationFee = 5000; // Class variable

    // Constructor
    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance Method
    void displayVehicleDetails() {
        System.out.println("\nVehicle Details:");
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: " + registrationFee);
    }

    // Class Method
    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }
}

public class VehicleRegistration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Owner Name: ");
        String owner = sc.nextLine();

        System.out.print("Enter Vehicle Type: ");
        String type = sc.nextLine();

        Vehicle v1 = new Vehicle(owner, type);
        v1.displayVehicleDetails();

        System.out.print("\nEnter New Registration Fee: ");
        double newFee = sc.nextDouble();

        Vehicle.updateRegistrationFee(newFee);

        System.out.println("\nAfter Updating Registration Fee:");
        v1.displayVehicleDetails();
    }
}


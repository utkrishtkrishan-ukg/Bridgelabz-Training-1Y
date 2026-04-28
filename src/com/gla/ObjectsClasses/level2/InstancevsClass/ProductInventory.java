package com.gla.ObjectsClasses.level2.InstancevsClass;
import java.util.Scanner;

class Product {
    String productName;
    double price;

    static int totalProducts = 0; // Class variable

    // Constructor
    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++; // Increase count when object is created
    }

    // Instance Method
    void displayProductDetails() {
        System.out.println("\nProduct Details:");
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
    }

    // Class Method
    static void displayTotalProducts() {
        System.out.println("\nTotal Products Created: " + totalProducts);
    }
}

public class ProductInventory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of products to create: ");
        int n = sc.nextInt();
        sc.nextLine();

        Product[] products = new Product[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Product " + (i + 1));
            System.out.print("Product Name: ");
            String name = sc.nextLine();

            System.out.print("Price: ");
            double price = sc.nextDouble();
            sc.nextLine();

            products[i] = new Product(name, price);
        }

        for (Product p : products) {
            p.displayProductDetails();
        }

        Product.displayTotalProducts();
    }
}


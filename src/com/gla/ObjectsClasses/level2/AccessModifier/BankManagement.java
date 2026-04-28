package com.gla.ObjectsClasses.level2.AccessModifier;
import java.util.Scanner;

class BankAccount {
    public String accountNumber;      // public
    protected String accountHolder;   // protected
    private double balance;           // private

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {

    void displayDetails() {
        System.out.println("\nSavings Account Details:");
        System.out.println("Account Number: " + accountNumber);  // public
        System.out.println("Account Holder: " + accountHolder);  // protected
        System.out.println("Balance: " + getBalance());          // private via getter
    }
}

public class BankManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SavingsAccount sa = new SavingsAccount();

        System.out.print("Enter Account Number: ");
        sa.accountNumber = sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        sa.accountHolder = sc.nextLine();

        System.out.print("Enter Balance: ");
        double balance = sc.nextDouble();
        sa.setBalance(balance);

        sa.displayDetails();
    }
}

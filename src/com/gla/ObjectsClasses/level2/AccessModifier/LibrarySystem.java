package com.gla.ObjectsClasses.level2.AccessModifier;
import java.util.Scanner;

class Book {
    public String ISBN;        // public
    protected String title;    // protected
    private String author;     // private

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
}

class EBook extends Book {

    void displayDetails() {
        System.out.println("\nEBook Details:");
        System.out.println("ISBN: " + ISBN);        // public
        System.out.println("Title: " + title);      // protected
        System.out.println("Author: " + getAuthor()); // private via getter
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        EBook ebook = new EBook();

        System.out.print("Enter ISBN: ");
        ebook.ISBN = sc.nextLine();

        System.out.print("Enter Title: ");
        ebook.title = sc.nextLine();

        System.out.print("Enter Author: ");
        String author = sc.nextLine();
        ebook.setAuthor(author);

        ebook.displayDetails();
    }
}


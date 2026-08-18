package com.project;

import java.util.ArrayList;
import java.util.Scanner;

class Book {
    int bookId;
    String bookName;
    String author;
    boolean issued;

    Book(int bookId, String bookName, String author) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
        this.issued = false;
    }
    void displayBook() {
        System.out.println("Book ID     : " + bookId);
        System.out.println("Book Name   : " + bookName);
        System.out.println("Author      : " + author);
        System.out.println("Status      : " +
                (issued ? "Issued" : "Available"));
    }
}
class Student {
    int studentId;
    String studentName;

    Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    void displayStudent() {
        System.out.println("Student ID   : " + studentId);
        System.out.println("Student Name : " + studentName);
    }
}

public class LibaryManagementSystem {
    static Scanner sc = new Scanner(System.in);

    static ArrayList<Book> books = new ArrayList<>();
    static ArrayList<Student> students = new ArrayList<>();

    static int bookId = 1;
    static int studentId = 1;
	

	public static void main(String[] args) {
		System.out.println("main method started");
        while (true) {
            System.out.println("--------------LIBRARY MANAGEMENT SYSTEM ------");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Add Student");
            System.out.println("4. View Students");
            System.out.println("5. Issue Book");
            System.out.println("6. Return Book");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
            case 1:
                addBook();
                break;

            case 2:
                viewBooks();
                break;

            case 3:
                addStudent();
                break;

            case 4:
                viewStudents();
                break;

            case 5:
                issueBook();
                break;

            case 6:
                returnBook();
                break;
                
            case 7:
                System.out.println("Thank you!");
                System.exit(0);

            default:
                System.out.println("Invalid choice!");
            }
        }
    }
	
    static void addBook() {

        sc.nextLine();

        System.out.print("Enter book name: ");
        String name = sc.nextLine();

        System.out.print("Enter author name: ");
        String author = sc.nextLine();

        Book b = new Book(bookId++, name, author);

        books.add(b);

        System.out.println("Book added successfully!");
        System.out.println("Book ID: " + b.bookId);
    }
    static void viewBooks() {

        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }

        for (Book b : books) {
            System.out.println("\n----------------");
            b.displayBook();
        }
    }
    static void addStudent() {

        sc.nextLine();

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        Student s = new Student(studentId++, name);

        students.add(s);

        System.out.println("Student added successfully!");
        System.out.println("Student ID: " + s.studentId);
    }
    static void viewStudents() {

        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }

        for (Student s : students) {
            System.out.println("\n----------------");
            s.displayStudent();
        }
    }
    static void issueBook() {

        System.out.print("Enter book ID: ");
        int id = sc.nextInt();

        Book book = findBook(id);

        if (book == null) {
            System.out.println("Book not found!");
            return;
        }

        if (book.issued) {
            System.out.println("Book is already issued!");
        } else {
            book.issued = true;
            System.out.println("Book issued successfully!");
        }
            }
    
    static void returnBook() {

        System.out.print("Enter book ID: ");
        int id = sc.nextInt();

        Book book = findBook(id);

        if (book == null) {
            System.out.println("Book not found!");
            return;
        }

        if (!book.issued) {
            System.out.println("Book is already available!");
        } else {
            book.issued = false;
            System.out.println("Book returned successfully!");
        }
    }
    static Book findBook(int id) {

        for (Book b : books) {
            if (b.bookId == id) {
                return b;
            }
        }

        return null;
	}

}

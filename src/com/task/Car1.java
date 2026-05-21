package com.task;

public class Car1 {
	
	
   
    String brand;
    double price;

    // Constructor
    Car1(){
    
        brand = "Tiago";
        price = 1500000;
    }

    // Method to display details
    void display()
    {
        System.out.println("Car Brand : " + brand);
        System.out.println("Car Price : " + price);
    }

    // Main method
    public static void main(String[] args)
    {
        // Creating object
        Car1 c1 = new Car1();

        // Displaying details automatically
        c1.display();
    }
    
	}


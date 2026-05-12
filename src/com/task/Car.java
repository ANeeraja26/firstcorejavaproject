package com.task;

public class Car {
	
	void carDetails(String carName, String color, String brand, String model) {
		System.out.println("Car Name: " + carName);
        System.out.println("Color: " + color);
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);

    }

	public static void main(String[] args) {
		Car c1=new Car();

        
       
        c1.carDetails("Tiago","Blue","Tata" ,"2024");
        
        

	}

}

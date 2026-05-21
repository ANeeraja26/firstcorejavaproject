package com.language.constructor;

public class Car {
	
	String model;
	String brand;
	double price;
	static String orgname="Neeraja";
	
	
	Car(String model,String brand,double price,String orgname){
		this.model=model;
		this.brand=brand;
		this.price=price;
		this.orgname=orgname;
		
		
	}



	


	

	public static void main(String[] args) {
		System.out.println("main method started");
		
		//Car c=new Car();
		// c.info();
		
		Car c1=new Car("Tata", "Tiago", 150000,"Tata");
		c1.info();
		
		Car c2=new Car("Tata", "Tiago", 150000,"Tata");
		c2.info();

	}
	
	 void info(){
		 System.out.println("Model of the car:"+model);
		 System.out.println("brand of the car:"+model);
		 System.out.println("price of the car:"+price);
		 System.out.println("orgname :"+orgname);

		
	}

}

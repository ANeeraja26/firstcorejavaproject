package com.task;

public class RestaurantBill {
	String customerName;
	String foodItem;
	int quantity;
	double price;
	
	RestaurantBill(String customerName,String foodItem,int quantity,double price) {
		
		this.customerName=customerName;
		this.foodItem=foodItem;
		this.quantity=quantity;
		this.price=price;
	}
	
	void calculateBill() {
		double total=quantity*price;
		
		System.out.println("-------------------RestaurantBill------------------");
		System.out.println("customerName:"+customerName);
		System.out.println("foodItem:"+foodItem);
		System.out.println("quantity:"+quantity);
		System.out.println("price:"+price);
		System.out.println("final Bill:"+total);
		
	}


	
	
	
	
	
	

	public static void main(String[] args) {
		
		RestaurantBill c1 = new RestaurantBill("Neeraja", "Pizza", 2, 250);
        RestaurantBill c2 = new RestaurantBill("Ram", "Burger", 3, 120);
        RestaurantBill c3 = new RestaurantBill("Neeru", "Dosa", 4, 80);
        
        
        
      System.out.println("main method started");
      
      
      
      c1.calculateBill();
      c2.calculateBill();
      c3.calculateBill();

	}

}

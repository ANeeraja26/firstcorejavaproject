package com.language.constructor;

public class Employee {
	
	int eid;
	int age;
	String ename;
	
	Employee(){
		
		System.out.println("No arg constructor called");
		eid=100;
		age=24;
		ename="Neeraja";
		
	}
	
	
	Employee(int eid,int age,String ename){
		System.out.println("patameterzied constructor called");
		this.eid=eid;
		this.age=age;
		this.ename=ename;
		
		
	
		
	}
	
	
	

	public static void main(String[] args) {
   System.out.println("main method started");
   
   Employee emp1=new Employee();
   emp1.dispaly();
   
   Employee emp2=new Employee(101,24,"Neeru");
   emp1.dispaly();
   
   
   
   
   
   System.out.println("main method ended");
   
   
   
	}
	
	 void dispaly(){
		 System.out.println("Employee ID:"+eid);
		 System.out.println("Employee Age:"+age);
		 System.out.println("Employee Name:"+ename);
		
	}

}

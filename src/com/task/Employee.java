package com.task;

public class Employee {
	
	int id;
	String name;
	double salary;
	
    Employee() {
        this(101);
        System.out.println("No Arg Constructor called");
    }
    
    Employee(int id){
    	this(id,"Neeraja");
    	System.out.println("one arg Constructor called");
    }
    
    Employee(int id, String name){
    	this(id,name,50000);
    	System.out.println("Two arg Constructor called");
    }
    
    Employee(int id, String name,double salary){
    	this.id=id;
    	this.name=name;
    	this.salary=salary;
    	System.out.println("Three arg Constructor called");
    }
    
    void display(){
    	System.out.println("Employee id:"+ id);
    	System.out.println("Employee name:"+ name);
    	System.out.println("Employee salary:"+ salary);
	   
   }
 
 
    


	

	public static void main(String[] args) {
		System.out.println("main method started");
		
		Employee e1=new Employee();
		
		System.out.println("----------employee details-----------");
		e1.display();
		
		

	}

}

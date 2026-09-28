package com.task;

 class Employees extends Thread{
	 
	 int salary;
	 
	 Employees (String name,int salary){
		 super(name);
		 this.salary=salary;
	 }
	 
	 
	 
	 
	 
	 
	 @Override
	public void run() {
	        System.out.println(getName() + " salary: " + salary);

	 
 }
 }


public class MultipleEmployeeThreads {

	public static void main(String[] args) {
		
        Employees e1 = new Employees("Employee 1", 25000);
        Employees e2 = new Employees("Employee 2", 27000);
        Employees e3 = new Employees("Employee 3", 30000);
        
        
        e1.start();
        e2.start();
        e3.start();
        
        try {
        	e1.join();
        	e2.join();
        	e3.join();
        	
        }catch(InterruptedException e) {
        	e.printStackTrace();
        	
        }
        
        int totalsalary=e1.salary+e2.salary+e3.salary;
        
        System.out.println("Total salary:"+ totalsalary);

		
		

	}

}
 
 

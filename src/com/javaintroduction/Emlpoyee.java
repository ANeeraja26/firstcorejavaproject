package com.javaintroduction;

public class Emlpoyee {
	
	int eid;
	String ename;
	
	static int orgID=555;
	 static String orgName="Vcube";
	 
	 
	

	public static void main(String[] args) {
		
		System.out.println("main method started");
		System.out.println("Emlpoyee information");
		
		Emlpoyee emp1=new Emlpoyee();
		emp1.eid=101;
		emp1.ename= "Neeraja";
		
		System.out.println("Organization ID:"+ orgID);
		System.out.println("Organization Name:"+ orgName);
		System.out.println("Emlpoyee ID:"+ emp1.eid);
		System.out.println("Emlpoyee Name:"+emp1.ename);
		
		Emlpoyee emp2=new Emlpoyee();
		emp2.eid=102;
		emp2.ename= "Rami";
		
		System.out.println("Organization ID:"+ orgID);
		System.out.println("Organization Name:"+ orgName);
		System.out.println("Emlpoyee ID:"+ emp2.eid);
		System.out.println("Emlpoyee Name:"+emp2.ename);

		
		Emlpoyee emp3=new Emlpoyee();
		emp3.eid=101;
		emp3.ename= "Neeraja/Ram";
		
		System.out.println("Organization ID:"+ orgID);
		System.out.println("Organization Name:"+ orgName);
		System.out.println("Emlpoyee ID:"+ emp3.eid);
		System.out.println("Emlpoyee Name:"+emp3.ename);

		
			

	}

}

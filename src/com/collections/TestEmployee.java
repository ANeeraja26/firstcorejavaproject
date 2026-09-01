package com.collections;

import java.util.ArrayList;
import java.util.List;

public class TestEmployee {

	public static void main(String[] args) {

		Employee emp1 = new Employee(1, "Neeraja", 150000, 24);
		Employee emp2 = new Employee(1, "Neeru", 160000, 25);
		Employee emp3 = new Employee(1, "Neeraj", 170000, 26);
		Employee emp4 = new Employee(1, "NeerajaReddy", 180000, 27);
		
		
		List<Employee> empList=new ArrayList<>();
		
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		
		for(Employee emp:empList) {
			System.out.println(empList);
			
		}
		
	//	System.out.println(empList);

		
		

		
		

	}

}

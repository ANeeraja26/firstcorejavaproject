package com.languagefundamentals.methods;

import java.util.Scanner;

public class TestDemo6 {
	
	double getEmpSalary() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your salary:");
		double salary=sc.nextDouble();
		return salary;
	}
	
	double getBonus() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your bonus:");
		double bouns=sc.nextDouble();
		return bouns;
	}

	
	

	public static void main(String[] args) {
   System.out.println("main mrthod started");
   
   TestDemo6 t=new TestDemo6();
  double sal= t.getEmpSalary();
  double bon= t.getBonus();
  System.out.println("total salary:"+(sal+bon));
	}

}

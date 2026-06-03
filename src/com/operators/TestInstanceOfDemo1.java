package com.operators;

// instance of operators is for checking the reference variable
//whether the reference variable is from given object child or not...?
public class TestInstanceOfDemo1 {

	public static void main(String[] args) {
   System.out.println("Main method started");
   
   Integer i1=100;
    
   System.out.println(i1 instanceof Integer);//true
   System.out.println(i1 instanceof Number);//true
   System.out.println(i1 instanceof Object);//true
   
   System.out.println(null instanceof Integer);//false
   
	}

}

package com.collections;

import java.util.ArrayList;
import java.util.Collection;
public class TestDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		Object[]arr=new Object[5];
		
		arr[0]="Neeraja";
		arr[1]=100;
		arr[2]=5.9;
		arr[3]=75.4;
		arr[4]="Vcube";
		
		Collection<Integer> c=new ArrayList<>();
		
		c.add(40);
		c.add(50);
		c.add(60);
		c.add(10);
		c.add(20);
		c.add(30);
		
//	    c.add("Apple");
//		c.add("Banana");
//		
//		
//		c.add(55.5);
//		c.add(35.5);
//		
				
		
		System.out.println(c);
		
		
		

	}

}

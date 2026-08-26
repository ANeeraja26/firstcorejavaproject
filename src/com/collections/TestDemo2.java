package com.collections;

import java.util.ArrayList;
import java.util.Collection;

public class TestDemo2 {

	public static void main(String[] args) {
		
		Collection<String> boys =new ArrayList<>();
		
		
		boys.add("Rami");
		boys.add("Ram");
		boys.add("Riyash");
		
		System.out.println(boys);
		
		Collection<String> girls =new ArrayList<>();
		girls.add("Neeraja");
		girls.add("Neeru");
		girls.add("Nirmala");
		System.out.println(girls);
		
		Collection<String> students =new ArrayList<>();
		students.addAll(boys);
		students.addAll(girls);
		
		boys.clear();
		System.out.println("****************************");
		
		
		System.out.println(students);
		System.out.println(boys);//[]
		System.out.println(students.contains("Srinivas"));	//false
		System.out.println(students.contains("Neeraja"));//true
		System.out.println("*********************************************");
		
		
		System.out.println(students.containsAll(girls));//ture
		System.out.println(boys);//[]
		// boys.add("Srinivas");
		System.out.println(students.containsAll(boys));//true
		
		
		
		
		
		
		
		
		
		
		


		
		
		
		
		


	}

}

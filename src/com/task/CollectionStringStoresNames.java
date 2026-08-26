package com.task;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionStringStoresNames {

	public static void main(String[] args) {
        
		Collection<String> names=new ArrayList<>();
		
		names.add("Neeraja");
		names.add("Neeru");
		names.add("Rami");
		names.add("Ramu");
		names.add("Chinna");
		names.add("Riyash");
		names.add("yanvika");
		names.add("Tharun");
		names.add("Neeraj");
		names.add("Buddi");
		System.out.println(names);
		System.out.println(names.contains("Neeraja"));//true
		System.out.println(names.size());//10
		System.out.println(names.isEmpty());//false
		names.clear();
		System.out.println(names);//[]
		System.out.println(names.isEmpty());//true
		

		
		
		
	}

}

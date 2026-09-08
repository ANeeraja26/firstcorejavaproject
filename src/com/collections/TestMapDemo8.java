package com.collections;

import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class TestMapDemo8 {

	public static void main(String[] args) {
		
		Map<String,String>map=new ConcurrentHashMap<>();//A - Apple
		//B - Boll
		//C - Cat
     //		D - Dog
   //		E - EYE
   //		O - Orange
		
		map.put("A", "Apple");
		map.put("B", "Boll");
		map.put("C", "Cat");
		map.put("D", "Dog");
		map.put("E", "EYE");
		
		System.out.println(map);//{A=Apple, B=Boll, C=Cat, D=Dog, E=EYE}
                                          //		A - Apple
                                           //		B - Boll
                                            //		C - Cat
                                             //		D - Dog
                                              //		E - EYE

		
		for(Entry<String,String> entry:map.entrySet()) {
			System.out.println(entry.getKey() + " - "  + entry.getValue());
			map.put("O", "Orange");
			
		}

		

	}

}

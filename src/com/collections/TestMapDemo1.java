package com.collections;

import java.util.HashMap;
import java.util.Map;

public class TestMapDemo1 {

	public static void main(String[] args) {
		
		Map<Integer,String> map=new HashMap<>();
		
		map.put(1, "Neeraja");
		map.put(6, "Neeru");
		map.put(13, "Ramu");
		map.put(11, "Rami");
		map.put(21, "Neeraja");
		
		
		System.out.println(map.containsKey(1));//true
		System.out.println(map.get(13));//Ramu
		System.out.println(map.containsValue("Rami"));//true
		System.out.println(map.containsKey("neeru"));//false
		System.out.println(map.remove(6));
		System.out.println(map);//{1=Neeraja, 21=Neeraja, 11=Rami, 13=Ramu}
		System.out.println(map);//{1=Neeraja, 21=Neeraja, 6=Neeru, 11=Rami, 13=Ramu}

		

	}
	
	

}

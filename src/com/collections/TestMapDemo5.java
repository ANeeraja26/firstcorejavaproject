package com.collections;

import java.util.IdentityHashMap;
import java.util.Map;

// HashMap VS IdentityHashMap
public class TestMapDemo5 {

	public static void main(String[] args) {

		Map<String, String> map = new IdentityHashMap<>();

		String s1 = "Neeraja";//1001
		String s2 = "Neeraja";//1002

//		String s1=new String("Neeraja");
//		String s2=new String("Neeraja");//{Neeraja=good girl}

		map.put(s1, "Neeru");
		map.put(s2, "good girl");

		System.out.println(map);// {Neeraja=good girl}

	}

}

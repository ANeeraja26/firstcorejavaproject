package com.collections;

import java.util.ArrayList;
import java.util.List;

public class TestDemoList8 {

	public static void main(String[] args) {

		List<String> friuts=new ArrayList<>();
		friuts.add("Banana");
		friuts.add("orange");
		friuts.add("garape");
		friuts.add("apple");
		friuts.add("papaya");
		friuts.add("gova");
		System.out.println(friuts);
		
		List<String> Vegtables=new ArrayList<>();
		Vegtables.add("Banana");
		Vegtables.add("potato");
		Vegtables.add("tamato");
		Vegtables.add("chilli");
		System.out.println(Vegtables);
		
		friuts.retainAll(Vegtables);
		System.out.println(friuts);//banana
		
		
		
		
		
	}

}

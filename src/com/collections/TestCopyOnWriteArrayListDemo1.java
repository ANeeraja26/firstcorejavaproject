package com.collections;

import java.util.ArrayList;

public class TestCopyOnWriteArrayListDemo1 {

	public static void main(String[] args) {
       
		ArrayList<Integer>al=new ArrayList<>();
		al.add(100);
		al.add(150);
		al.add(200);
		al.add(300);
		al.add(400);
		
		for(Integer a:al) {
			System.out.println(a);
			al.add(600);
			
			
		}
		
		//  java.util.ConcurrentModificationException
		System.out.println(al);

		
	}

}

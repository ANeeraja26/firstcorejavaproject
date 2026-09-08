package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestLaptop {

	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<>();
		list.add(100);
		list.add(60);
		list.add(70);
		list.add(40);
		list.add(80);
		Collections.sort(list);//[40, 60, 70, 80, 100]
		System.out.println(list);//[100, 60, 70, 40, 80]
		
		Laptop l1=new Laptop("Intel","Dell",100000);
		Laptop l2=new Laptop("Thinkpad","Lenovo",80000);
		Laptop l3=new Laptop("pavilian","hp", 90000);
		Laptop l4=new Laptop("MacBook","Mac",120000);
		Laptop l5=new Laptop("Vivo-book","ASUS",70000);
		
		List<Laptop> lp=new ArrayList<>();
		lp.add(l1);
		lp.add(l2);
		lp.add(l3);
		lp.add(l4);
		lp.add(l5);
		
		Collections.sort(lp);
		
		for(Laptop l:lp) {
			System.out.println(l);
			
		}
		System.out.println(lp);


		
		


		
		
		
		



	}

}

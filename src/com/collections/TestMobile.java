package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestMobile {

	public static void main(String[] args) {
		
		Mobile m1=new Mobile("9R","One puls",40000);
		Mobile m2=new Mobile("5R","Vivo",60000);
		Mobile m3=new Mobile("4R","Iphone",90000);
		Mobile m4=new Mobile("3R","samsung",70000);
		
		List<Mobile> ml=new ArrayList<>();
		ml.add(m1);
		ml.add(m2);
		ml.add(m3);
		ml.add(m4);
		
		// Anonymous inner class implements comparator
		Comparator<Mobile> c = new Comparator<Mobile>() {

		    @Override
		    public int compare(Mobile o1, Mobile o2) {

		        if (o1.price < o2.price) {
		            return -1;
		        } 
		        else if (o1.price > o2.price) {
		            return 1;
		        } 
		        else {
		            return 0;
		        }
		    }
		};

		Collections.sort(ml, c);
		
		
		
		for(Mobile m:ml) {
			System.out.println(m);
		}

		

		

	}

}

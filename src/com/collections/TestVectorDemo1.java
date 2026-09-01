package com.collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class TestVectorDemo1 {

	public static void main(String[] args) {

		Vector<Integer> v=new Vector<>();
		v.addElement(10);
		v.addElement(20);
		v.addElement(40);
		v.addElement(50);
		v.addElement(60);
		
		v.addElement(10);
		v.addElement(20);
		v.addElement(40);
		v.addElement(50);
		v.addElement(60);
		
		v.add(null);
		v.add(null); // [10, 20, 40, 50, 60, 10, 20, 40, 50, 60, null, null]
		
		Enumeration<Integer>enm=v.elements();
		while(enm.hasMoreElements()) {
			System.out.println(enm.nextElement());
			
		}
		
//		Iterator<Integer>itr=v.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//			
//		}
		
		
		System.out.println(v);//[10, 20, 40, 50, 60]
		
		
		
	}

}

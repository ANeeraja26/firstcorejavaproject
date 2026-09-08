package com.collections;

import java.util.Map;
import java.util.WeakHashMap;

class Student {

	@Override
	public String toString() {
		return "Student ";
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize method called");
	}

}

   // WeakHashMap vs HashMap
    public class TestMapDemo6 {

	public static void main(String[] args) throws InterruptedException {

		Map<Object, String> map = new WeakHashMap<>();

		Student s = new Student();

		map.put(s, "Neeraja");

		  System.out.println(map);// {Student =Neeraja}
		  
		  s=null;
		  System.gc();
		  
		  Thread.sleep(2000);
		  System.out.println(map);//{Student =Neeraja}
		                            // {Student =Neeraja}

		  
		  
		  
		  
		// System.out.println(map);//{com.collections.Student@1dbd16a6=Neeraja}

	}

}

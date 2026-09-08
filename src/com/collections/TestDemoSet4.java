package com.collections;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TestDemoSet4 {

	public static void main(String[] args) {
		NavigableSet<Integer> ns = new TreeSet<>();

        ns.add(20);
        ns.add(25);
        ns.add(30);
        ns.add(22);
        ns.add(200);
        ns.add(250);
        ns.add(300);

        System.out.println(ns.floor(22));
        System.out.println(ns.ceiling(200));
        System.out.println(ns.lower(200));
        System.out.println(ns.higher(30));
        System.out.println(ns);
        

		
		
		
	}

}

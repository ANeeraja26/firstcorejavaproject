package com.collections;

import java.util.LinkedList;
import java.util.Queue;

public class TestQueueDemo1 {

	public static void main(String[] args) {
		
		Queue<Integer> q=new LinkedList<>();
		q.add(10);
		q.add(30);
		q.add(11);
		q.add(34);
		q.add(15);
		q.add(23);
		
		System.out.println(q.peek());//10
		System.out.println(q.element());//10
		System.out.println(q.remove());//10
		System.out.println(q);//[30, 11, 34, 15, 23]


		
		
		

	}

}

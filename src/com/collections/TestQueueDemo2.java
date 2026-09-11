package com.collections;

import java.util.LinkedList;
import java.util.Queue;

public class TestQueueDemo2 {

	public static void main(String[] args) {
		
		Queue<Integer> q=new LinkedList<>();
		
		q.offer(12);
		q.offer(15);
		q.offer(11);
		q.offer(19);
		q.offer(5);
		q.offer(3);
		q.offer(null);
		
		System.out.println(q.peek());//12
		System.out.println(q.poll());//12
		
		System.out.println(q);//[12,15, 11, 19, 5, 3, null]


		
		
		
		

	}

}

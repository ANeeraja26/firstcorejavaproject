package com.collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class TestQueueDemo3 {

	public static void main(String[] args) {
		
		Queue<Integer> q=new PriorityQueue<>();
		
		q.offer(2);
		q.offer(1);
		q.offer(4);
		q.offer(3);
		
		
		System.out.println(q);//[1, 2, 4, 3]


	}

}

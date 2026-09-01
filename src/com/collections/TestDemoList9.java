package com.collections;

import java.util.ArrayList;
import java.util.List;

public class TestDemoList9 {

	public static void main(String[] args) {
		
		
     List<Integer> l1=new ArrayList<>();
     l1.add(10);
     l1.add(30);
     l1.add(40);
     l1.add(20);
     l1.add(40);
     l1.add(60);
     l1.add(80);
     
     List<Integer> l2=l1.subList(4, 7);
     System.out.println(l2);
     l2.add(100);
     l2.add(200);
     l2.remove(1);// [40, 60, 80]
                     //  [10, 30, 40, 20, 40, 80, 100, 200]
     
     System.out.println(l1); // [40, 60, 80]
                              //[10, 30, 40, 20, 40, 60, 80, 100, 200]


     
  
  
  
	}

}

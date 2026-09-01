package com.task;

import java.util.Arrays;
import java.util.List;

public class MissingNumberFromGivenList {

	public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 7, 8, 9, 10);
        
        for(int i=1;i<=10;i++) {
        	if(!list.contains(i)) {
                System.out.println("Missing Number: " + i);
                
        		
        	}
        	
        }

	}

}

package com.task;

import java.util.Arrays;
import java.util.List;

public class MaximumNumberOfList {

	public static void main(String[] args) {

		
        List<Integer> list = Arrays.asList(10, 100, 150, 80, 40, 70);

        int max = list.get(0);
        int second = list.get(0);

        for (int num : list) {
            if (num > max) {
                second = max;
                max = num;
            }
        }

        System.out.println("Maximum: " + max);
        System.out.println("Second Highest: " + second);

		
	}

}

package com.task;

public class CaseStudy2 {

	public static void main(String[] args) {


		        int[] ids = {101, 102, 101, 103, 102, 104};

		        int[] result = new int[ids.length];
		        int index = 0;

		        for (int i = 0; i < ids.length; i++) {
		            boolean duplicate = false;

		            for (int j = 0; j < index; j++) {
		                if (ids[i] == result[j]) {
		                    duplicate = true;
		                    break;
		                }
		            }
		            

		            if (!duplicate) {
		                result[index] = ids[i];
		                index++;
		            }
		        }

		        // Remaining positions are already 0 by default

		        System.out.println("Array after removing duplicates:");
		        for (int i = 0; i < result.length; i++) {
		            System.out.print(result[i] + " ");
		        }
		    }
		
	

}

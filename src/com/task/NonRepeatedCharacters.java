package com.task;

public class NonRepeatedCharacters {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		String str="Programming";
		
		for(int i=0;i<str.length();i++) {
			int count=0;
			
			for(int j=0;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j)) {
					count++;
				}
				
			}
			
			if(count==1) {
				System.out.println(str.charAt(i));
				break;
				
			}
			
			
			
			
			
		}
	}

}

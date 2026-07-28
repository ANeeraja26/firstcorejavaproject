package com.task;

public class RemoveDuplicateValues {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		String str="programming";
		String result="";
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			
			
			if(result.indexOf(ch)==-1) {
				
				result+=ch;
				
				
								
				
			}
			
		}
		
		System.out.println("input:"+str);
		System.out.println("output:"+result);

	}

}

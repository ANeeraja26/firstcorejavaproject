package com.exceptionhandling;

import java.io.File;
import java.io.IOException;

public class TestCheckedExDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		File f=new File("C:\\Users\\Neeraja Alavala\\OneDrive\\Desktop\\Neeraja Resumes\\Neeraja5.txt");
		
		try {
			f.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("main method ended");

	}

}

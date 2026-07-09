package com.fileio;

import java.io.File;
import java.io.IOException;

public class TestFileDemo3 {

	public static void main(String[] args) throws IOException {
		System.out.println("main method started");

		File f = new File("C:\\Users\\Neeraja Alavala\\OneDrive\\Desktop\\Neeraja Resumes\\Test\\neeru");
		
		System.out.println(f.isDirectory());
		System.out.println(f.isFile());
		
		System.out.println(f.getAbsolutePath());//String
		System.out.println(f.getAbsoluteFile());//file
		System.out.println(f.getCanonicalPath());//String
		System.out.println(f.getCanonicalFile());//file
		
		System.out.println(f.getFreeSpace());
		System.out.println(f.getTotalSpace());
		System.out.println(f.getUsableSpace());

		// boolean status=f.mkdir();
		// if(status) {
		// 	System.out.println("Directory has been created successfully");
			
		// }else {
			// System.out.println("something went wrong");
		// }
		
		System.out.println("main method ended");

	}

}

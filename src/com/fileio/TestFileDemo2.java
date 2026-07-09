package com.fileio;

import java.io.File;
import java.io.IOException;

public class TestFileDemo2 {

	public static void main(String[] args) throws IOException {
		System.out.println("main method started");
		
		File f = new File("C:\\Users\\Neeraja Alavala\\OneDrive\\Desktop\\Neeraja Resumes\\Test\\Neeraja1.word");
		// f.delete();
		boolean isExists=f.exists();
		if(!isExists) {
			f.createNewFile();
			System.out.println("file has been created successfully");
			
		}else {
			System.out.println("The file is already available");
		}
		
		
		System.out.println("main method ended");
		
		

	}

}

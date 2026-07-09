package com.fileio;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestFileDemo5 {

	public static void main(String[] args) throws FileNotFoundException,IOException, InterruptedException {
		System.out.println("main method started");
		
		FileReader fr=new FileReader("C:\\Users\\Neeraja Alavala\\OneDrive\\Desktop\\Neeraja Resumes\\Test\\Neeraja.txt");
		
	int i=fr.read();
	
	// System.out.println((char)i);
	
	while(i !=-1) {
		System.out.print((char)i);
		i=fr.read();
		Thread.sleep(500);
		
	}
	
	fr.close();
	}

}

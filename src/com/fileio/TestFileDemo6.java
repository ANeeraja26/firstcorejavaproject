package com.fileio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TestFileDemo6 {

	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader(
				"C:\\Users\\Neeraja Alavala\\OneDrive\\Desktop\\Neeraja Resumes\\Test\\Neeraja.txt");

		BufferedReader br = new BufferedReader(fr);
		
		String st=br.readLine();
		
		while(st !=null) {
			System.out.println(st);
			st=br.readLine();
			Thread.sleep(1000);
			
		}
		
		br.close();
		fr.close();

	}

}

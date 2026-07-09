package com.fileio;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TestFileDemo9 {

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("main method started");

		PrintWriter pw = new PrintWriter(
				"C:\\Users\\Neeraja Alavala\\OneDrive\\Desktop\\Neeraja Resumes\\Test\\Neeraja2.txt");
		
		pw.println("Hello");
		pw.println(100);
		pw.println(10.5);
		pw.println('N');
		pw.println(pw);
		pw.flush();
		pw.close();
	}

}


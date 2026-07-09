package com.fileio;

import java.io.File;
import java.io.IOException;

public class TestFileDemo1 {

	public static void main(String[] args) throws IOException {
		System.out.println("main method started");

		File f = new File("C:\\Users\\Neeraja Alavala\\OneDrive\\Desktop\\Neeraja Resumes\\Test\\Neeraja1.txt");
		// Atomically creates a new, empty file named by this abstract pathname if and
		// only if a file
		// with this name does not yet exist. The check for the existence of the file
		// and the creation
		// of the file if it does not exist are a single operation that is atomic with
		// respect to all
		// other file system activities that might affect the file.

		boolean status = f.createNewFile();
		if (status) {
			System.out.println("file has be created successfully");

		} else {
			System.out.println("something went wrong or file already exist");
		}

		System.out.println("main method ended");
	}

}

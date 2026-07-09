package com.fileio;

import java.io.File;

public class TestFileDemo4 {

	public static void main(String[] args) {
		File f = new File("c:\\Downloads");

		String[] names = f.list();
		int count = 0;
		for (String name : names) {
			System.out.println(name);
			
			count++;
			
			

		}

	}

}



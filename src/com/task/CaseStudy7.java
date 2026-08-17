
package com.task;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CaseStudy7 {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		FileReader fr = null;

        try {
            fr = new FileReader("employees.txt");

            int ch;

            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }
        }
        
        catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }

        catch (IOException e) {
            System.out.println("Error while reading the file.");
        }

        finally {
            try {
                if (fr != null) {
                    fr.close();
                }
            }
            catch (IOException e) {
                System.out.println("Error while closing the file.");
            }
        }
	}

}

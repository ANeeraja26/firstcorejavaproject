package com.fileio;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee  implements Serializable {
	String username = " Neeraja";
	String password = "javaissimple";
	int age = 24;
	long phone = 1234567891;

}

public class TestEmpSerializationDemo1 {

	public static void main(String[] args) throws IOException {
		System.out.println("main method started");

		Employee emp1 = new Employee();

		FileOutputStream fos = new FileOutputStream(
				"C:\\Users\\Neeraja Alavala\\OneDrive\\Desktop\\Neeraja Resumes\\Test\\Neeraja3");

		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(emp1);
		oos.close();
		fos.close();
	}

}

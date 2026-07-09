package com.fileio;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestEmpDeSerializationDemo2 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		FileInputStream fis = new FileInputStream(
				"C:\\Users\\Neeraja Alavala\\OneDrive\\Desktop\\Neeraja Resumes\\Test\\Neeraja3");

		ObjectInputStream ois = new ObjectInputStream(fis);

		Employee obj = (Employee) ois.readObject();

		System.out.println(obj.username);
		System.out.println(obj.password);
		System.out.println(obj.phone);
		System.out.println(obj.age);
		ois.close();
		fis.close();
	}

}

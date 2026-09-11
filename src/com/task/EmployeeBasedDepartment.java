package com.task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class EmployeeBasedDepartment {

	public static void main(String[] args) {

		HashMap<String, ArrayList<String>> map = new HashMap<>();

		map.put("IT", new ArrayList<String>());
		map.get("IT").add("Ravi");
		map.get("IT").add("Arun");
		map.get("IT").add("Anil");

		map.put("HR", new ArrayList<String>());
		map.get("HR").add("Priya");
		map.get("HR").add("Sneha");

		map.put("Sales", new ArrayList<String>());
		map.get("Sales").add("Kiran");

		System.out.println("IT    → " + map.get("IT"));
		System.out.println("HR    → " + map.get("HR"));
		System.out.println("Sales → " + map.get("Sales"));

	}
}

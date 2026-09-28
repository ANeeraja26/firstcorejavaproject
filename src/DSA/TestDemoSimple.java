package DSA;

// time complexity is O(1)--> when we use constant value
// space complexity is O(!)
// time complexity O(n)---> when we taken the value from console

import java.util.Scanner;

public class TestDemoSimple {

	public static void main(String[] args) {
		System.out.println("main method started");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value");
		int n=sc.nextInt();
		
		for(int i=0;i<=n;i++) {
			System.out.println(i);
			
		}
		
		
		System.out.println("main method ended");

	}

}

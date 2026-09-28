package DSA;

import java.util.Scanner;

// Linear Search

// if the value found in the first place --> enter a key-->  best case is O(1)----> : 10 ---> key index is : 0
// Average case---> enter a key--> 30---> key index is --> 3     ---> O(n)

// if the value is end or not available ---> worst case
// worst case---> enter a key---> 50----> key index is ---> 5

// space complexity is ----> O(1) (constant space)
public class TestDemo1 {

	static int search(int[] arr, int key) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				return i;

			}

		}
		return -1;

	}

	public static void main(String[] args) {
		System.out.println("main method started");

		int[] arr = { 10, 20, 30, 40, 50 };

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a key");
		int key = sc.nextInt();

		System.out.println("key index is : " + search(arr, key));
		sc.close();

	}

}

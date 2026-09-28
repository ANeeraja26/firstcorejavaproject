package DSA;

// find maximum sub array--> Kadane's Algoritham...?
public class MaximumSubarrayKadanesAlgoritham {

	public static void main(String[] args) {

		int[] arr = { 1, 2, -3, 4, 5 };
		int currentSum = 0;
		int max = Integer.MIN_VALUE;// -2147483648

		for (int i = 0; i < arr.length; i++) {
			currentSum = currentSum + arr[i];

			// 1) max---> max=1---> 3
			if (currentSum > max) {
				max = currentSum;

			}
			if (currentSum < 0) {
				currentSum = 0;

			}

		}
		
		System.out.println("maximum subarray is : " + max);

	}

}

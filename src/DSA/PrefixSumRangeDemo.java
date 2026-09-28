package DSA;

// range sum

// input ----> { 5, 10, 15, 20, 25 } ---> 2, 3 
// output ---->  

public class PrefixSumRangeDemo {

	public static void main(String[] args) {

		int[] arr = { 5, 10, 15, 20, 25 };

		int prefix[] = new int[arr.length];

		prefix[0] = arr[0];

		for (int i = 1; i < arr.length; i++) {
			prefix[i] = prefix[i - 1] + arr[i];
		}

		for (int e : prefix) {
			System.out.print(e + " ");
		}

		int left = 0;
		int right = 4;
		int sum = 0;

		
		if (left == 0) {
			sum = prefix[right];
		} else {
			sum = prefix[right] - prefix[left - 1];
		}

		System.out.println("\nsum of left and right value is : " + sum);
	}

}

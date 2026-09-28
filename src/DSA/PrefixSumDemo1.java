package DSA;

public class PrefixSumDemo1 {

	public static void main(String[] args) {

		int[] arr = { 5, 10, 15, 20, 25 };// 0,1,2,3,4

		int prefix[] = new int[arr.length];// 5

		prefix[0] = arr[0];

		for (int i = 1; i < arr.length; i++) {

			prefix[i] = prefix[i - 1] + arr[i];

		}
		
		for(int e:prefix) {
			System.out.print(e + " ");
			
		}

	}

}

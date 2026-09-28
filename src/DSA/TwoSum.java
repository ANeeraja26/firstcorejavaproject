package DSA;

public class TwoSum {

	public static int[] TwoSum(int[] nums, int target) {

		for (int i = 0; i < nums.length; i++) {
			for (int j = i; j < nums.length; j++) {

				if (nums[i] + nums[j] == target) {
					return new int[] { i, j };

				}

			}
		}

		return new int[] {};

	}

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 4 };
		int arr[] = TwoSum(nums, 5);  //0
		                              //3

		System.out.println(arr[0]);
		System.out.println(arr[1]);

	}

}

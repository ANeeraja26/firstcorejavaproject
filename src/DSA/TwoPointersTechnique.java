package DSA;

public class TwoPointersTechnique {

	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50};

        int target = 70;

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            int sum = arr[left] + arr[right];

            if (sum == target) {

                System.out.println("Pair found: "
                        + arr[left] + " + " + arr[right]);

                break;

            } else if (sum < target) {

                left++;

            } else {

                right--;
            }
        }

	}

}

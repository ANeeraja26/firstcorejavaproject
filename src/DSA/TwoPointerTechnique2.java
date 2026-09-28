package DSA;

public class TwoPointerTechnique2 {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5, 6, 7};

        int target = 8;

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            int sum = arr[left] + arr[right];

            if (sum == target) {

                System.out.println(arr[left] + " + "
                        + arr[right] + " = " + target);

                left++;
                right--;

            } else if (sum < target) {

                left++;

            } else {

                right--;
            }
        }

	}

}

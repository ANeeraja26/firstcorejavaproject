package DSA;

public class TestDemo2 {

	public static void main(String[] args) {

	    System.out.println("main method started");

	    int arr[] = {10, 20, 30, 40, 50};
	    int key = 40;

	    System.out.println("element found at : " + binarysearch(arr, key));
	}

	private static int binarysearch(int[] arr, int key) {

	    int low = 0;
	    int high = arr.length - 1;

	    while (low <= high) {

	        int mid = low + (high - low) / 2;

	        if (arr[mid] == key) {
	            return mid;
	        }
	        else if (key < arr[mid]) {
	            high = mid - 1;
	        }
	        else {
	            low = mid + 1;
	        }
	    }

	    return -1;
	}}

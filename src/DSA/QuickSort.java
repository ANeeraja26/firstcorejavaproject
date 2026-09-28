package DSA;

public class QuickSort {

	 public static void main(String[] args) {

	        int[] arr = {12, 4, 6, 9, 23, 15};

	        quicksort(arr, 0, arr.length - 1);

	        for (int n : arr) {

	            System.out.print(n + " ");
	        }
	    }

	    private static void quicksort(int[] arr, int low, int high) {

	        if (low < high) {

	            int pivotIndex = partition(arr, low, high);

	            quicksort(arr, low, pivotIndex - 1);      // left
	            quicksort(arr, pivotIndex + 1, high);     // right
	        }
	    }

	    private static int partition(int[] arr, int low, int high) {

	        int pivot = arr[low];

	        int start = low + 1;
	        int end = high;

	        while (start <= end) {

	            while (start <= high && arr[start] <= pivot) {
	                start++;
	            }

	            while (arr[end] > pivot) {
	                end--;
	            }

	            if (start < end) {
	                swap(arr, start, end);
	            }
	        }

	        // Place pivot in correct position
	        swap(arr, low, end);

	        return end;
	    }

	    private static void swap(int[] arr, int i, int j) {

	        int temp = arr[i];
	        arr[i] = arr[j];
	        arr[j] = temp;
	    }
	}